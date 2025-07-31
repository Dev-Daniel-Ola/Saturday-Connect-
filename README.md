Saturday Connect: Event, Space, People Converge


Saturday Connect: Saturday Connect is a JavaFX-based desktop application designed as an early-stage prototype of a modern event ecosystem. It connects Event Hosts, Venue Owners, and Attendees in a unified platform that simplifies venue discovery, event booking (and plaaning) and attendee engagement.

---

Tech Stack (Technology & Purpose)


Java (JDK 24) - Core programming language


JavaFX - Desktop GUI framework


FXML - UI markup for screen design


SceneBuilder - Visual design tool for building FXML layouts


MVC Pattern - Logical separation of UI and Logic (basic structure)

---

Project Structure


/loginInterface |---Saturday.java
#Main


JavaFX launcher |--- Layout.fxml
#Login screen 


UI layout  |--- UserTypeLayout.fxml 
#UserType screen


UI layout  |--- AttendeeLayout.fxml
#Attendee registration form


UI layout  |--- AttendeeLayoutExtension.fxml
#Attendee homepage


UI layout  |--- VenueOwnerLayout.fxml
#Venue Owner registration form


Controller logic  |--- AttendeeController.java
#Attendee logic for registration


Controller logic  |--- AttendeeExtension.java
#Logic for Attendee homepage


Controller logic  |--- ButtonController.java
#Sign up logic


Controller logic  |--- UserTypeController.java
#logic for UserType selection

---

How to Run


Ensure Java 24 and JavaFX SDK are installed.


Open the project in your IDE (VS Code or Intellij).


Link JavaFX libraries in the project settings.


Run 'Saturday.java' as your main class.


You can also via terminal


'''bash


javac --module-path \path\to\javafx-sdk\lib --add-modules javafx.controls,javafx.fxml loginInterface\*.java controller\*.java


java --module-path \path\to\javafx-sdk\lib --add-modules javafx.controls,javafx.fxml loginInterface.Saturday 