MITTPP

Project task for college course  
Methods and Techniques of Testing Software Support  

Automated UI Testing with Selenium and TestNG

---

## Project Overview

This project contains automated UI tests for the **Links.hr** e-commerce website.
The tests are implemented using **Selenium WebDriver** and **TestNG**, following the
**Page Object Model (POM)**.

The main goal of the project is to demonstrate the creation of a simple automated
testing framework and the implementation of multiple functional UI test cases.

---

## Technologies Used

- **Java** – programming language used for writing test scripts  
- **Selenium WebDriver** – browser automation framework  
- **TestNG** – testing framework for organizing and executing tests  
- **Maven** – dependency management and build automation tool  
- **Google Chrome** – browser used for testing  

---

## Prerequisites
1. Install **Java 8+**
2. Install **Maven** (for dependency management)
3. Install **Google Chrome**

## Setup Instructions
1. Clone this repository:
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```
3. Run the test suite using TestNG:
   ```sh
   mvn test
   ```

## Running Tests Manually
1. Tests can also be executed directly from an IDE (e.g. IntelliJ IDEA):
2. Open any test class (e.g. SmokeTests.java, SearchTest.java, CartTest.java)
3. Right-click the file
4. Select Run

## Test Cases
| Test Case | Description |
|----------|-------------|
| `openHomePage` | Verifies that the Links homepage loads successfully and the page title is present |
| `searchReturnsResults` | Verifies that searching for a valid product keyword returns search results |
| `searchNoResults` | Verifies that searching for a non-existing product shows no results |
| `openFirstProductFromResults` | Opens the first product from the search results and verifies navigation to the product page |
| `addProductToCart` | Adds a product to the shopping cart and verifies that it was added successfully |

## Notes
- Explicit waits (WebDriverWait) are used to improve test stability.
- The `@BeforeMethod` annotation sets up the WebDriver before each test.
- The `@AfterMethod` annotation ensures the WebDriver quits after each test to prevent memory leaks.
- Cookie consent pop-ups are handled automatically to prevent test interruptions.

