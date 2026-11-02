# Event Registration Manager

## Project Description

The Event Registration Manager is a Java Swing desktop application designed to manage event participants. It allows users to register participants, view participant records, search for participants using their ID, and update registration statuses.

The application uses a manually implemented array and linear search to store and retrieve participant records.

## Features

- Register new participants
- Support student and guest participants
- Display registered participants in a table
- Search participants using their Participant ID
- Update registration status
- Validate participant information

## Technologies Used

- Java
- Java Swing
- Apache NetBeans IDE
- Git and GitHub

## Data Structure and Algorithm

- **Data Structure:** Manually implemented array
- **Searching Algorithm:** Linear search

## Project Type

IT20 – Data Structures and Algorithms  
IT21 – Object-Oriented Programming

Midterm Project | S.Y. 2026–2027
## How to Run the Project

1. Install Java JDK 24 or a compatible JDK.
2. Install Apache NetBeans IDE.
3. Clone or download the project from the GitHub repository.
4. Open Apache NetBeans.
5. Select **File → Open Project**.
6. Locate and select the `EventRegistrationManager` project folder.
7. Click **Run Project** to launch the application.

## Data Storage

The application stores participant records temporarily in an array while the program is running. Records are not permanently saved in a database.
## Team Members and Roles

| Team Member | Responsibilities |
|---|---|
| Amie Sujetado | Java GUI development, participant management, and array implementation |
| Eugene Piolo Suminao | Object-oriented programming, participant classes, and project testing |

## Data Structure Implementation

The system uses a manually implemented array to store participant records.

- **Array:** Stores participant objects.
- **Count:** Tracks the current number of registered participants.
- **Linear Search:** Checks each participant ID one by one to find a record.
- **Deletion:** Removes a participant and shifts the remaining records to the left.

These operations help manage participant records without using Java Collections.

## Linear Search Implementation

The system uses linear search to find participants by their ID.

1. The search starts at the first participant.
2. It checks each participant's ID one by one.
3. If the ID matches, it returns the participant.
4. If no match is found, it returns null.

This method makes it easy to find registered participants using their unique IDs.

## Participant Counting

The system can count participants based on their type.

- `countStudents()` counts all student participants.
- `countGuests()` counts all guest participants.

Both methods check the participant array one by one and return the total number for each type.

## Participant Deletion

The system can delete a participant using their ID.

1. The program searches for the participant ID.
2. If the ID exists, the participant is removed.
3. The remaining participants move one position to the left.
4. The participant count decreases by one.

This keeps the array organized after a participant is deleted.
