import Notification.{someSms, someVoiceRecording}

object Notification {

  abstract class Notification
  case class Email(sender: String, title: String, body: String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got an email from $email with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) => {
        "You got an email from special someone!";
      }
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }

  val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

  val someSms = SMS("123-4567", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
  val importantSms = SMS("867-5309", "I'm here! Where are you?")


  def main(args: Array[String]): Unit = {


    println(showImportantNotification(someSms, importantPeopleInfo)) //prints You got an SMS from 123-4567! Message: Are you there?
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo)) //prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
    println(showImportantNotification(importantEmail, importantPeopleInfo)) //prints You got an email from special someone!
    println(showImportantNotification(importantSms, importantPeopleInfo)) //prints You got an SMS from special someone!
  }








}
