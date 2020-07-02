# PostcodesTestingAPI

## Project Aim:
The objective of this program is to give testers an easier way to test the Postcodes API, using Data Transfer Objects to allow for more efficient testing.

## Technology:
GitHub: Used for project management. Using it to manage the quality of code and also to back up everything needed for the project.

Postman: Used to view the URL for the API. It allowed me to view the headers and all the information that the API provides as a JSON.

Intellij: IDE of choice, allowed for easy access to GitHub as I was able to push individual classes as and files when ever I desired.

## Languages, Libraries and dependencies:
- Java 14
- Git
- Maven
- JUNIT 4.6.2
- Jackson 2.11.1

## Building tests
Testers should follow these stages when writing tests for this API.

1. Testing the Response Code:
  - Using the PostcodesDTO.getStatus method you can retrieve the reponse code.

2. Testing the Headers are Correct:
  - Checking each headers will allow you to see the background information of the API. For example, checking the date header will help you find out if your working with a live API or not as it should give you an accurate day, date and time in GMT.

3. Testing the Body of the JSON.
  - The body of the API is read as a JSON. This is where all the information is stored. The first thing with this is the Postcode, using the PostcodesDTO.getPostcode method you can find out if you are working with the right information.

  The Idea behind this framework is to use DTO's so that testers will not have to create methods to test but rather test methods or variable within the API.