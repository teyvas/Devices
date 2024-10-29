# <Devices>

## Description

It is a comprehensive application designed to manage and monitor various types of devices. It provides a user-friendly graphical user interface (GUI) to add, view, and manage devices effectively. This project aims to streamline device management processes and enhance user interaction with the system.

## Features

- Add various types of devices to the management system.
- View detailed information about each device.
- Delete devices from the system.
- Real-time status monitoring of devices.

## How to Run the Program

### Prerequisites

- Java SDK 22
- IntelliJ IDEA 2024.2.3 Ultimate Edition
- Maven or Gradle for dependency management
- Database (if applicable, specify the type, e.g., MySQL, PostgreSQL)

### Steps to Run

1. **Clone the Repository**
   ```sh
   git clone <https://github.com/teyvas/Devices>
   cd <project_directory>
   ```

2. **Build the Project**
    - Using Maven:
      ```sh
      mvn clean install
      ```
    - Using Gradle:
      ```sh
      gradle build
      ```

3. **Run the Application**
    - From IntelliJ IDEA:
        1. Open the project in IntelliJ IDEA.
        2. Navigate to the `Main` class.
        3. Click the "Run" button.

    - From Command Line:
      ```sh
      java -jar <path_to_generated_jar_file>
      ```

## Screenshots

![Screenshot 1](All%20devices.png)
*Figure 1. Dashboard view with multiple devices.*

![Screenshot 2](Adding%20device.png)
*Figure 2. Adding a new device.*


## Sample Inputs

### Device Type 1: Laptop

```json
{
  "type": "Laptop",
  "name": "Dell",
  "price": "100000",
   "weight": "3010",
  "processor type": "Intel Core i7",
  "ram": "16 GB"
}
```

### Device Type 2: Smartphone

```json
{
  "type": "Smartphone",
  "name": "iPhone 14",
  "price": "100000",
  "weight": "421",
  "screen size": "452",
  "camera resolution": "64"
}
```


## Contributing

1. Fork the repository.
2. Create your feature branch:
   ```sh
   git checkout -b feature/<feature_name>
   ```
3. Commit your changes:
   ```sh
   git commit -m "Add some feature"
   ```
4. Push to the branch:
   ```sh
   git push origin feature/<feature_name>
   ```
5. Open a pull request.
