# Cucumber Selenium Test Automation Framework

This project is a **Cucumber**, **Selenium WebDriver**, and **Java** based automation framework built with **TestNG** and the **Page Object Model (POM)** structure. It provides a maintainable, scalable, and easy-to-understand structure for web test automation.

## 🚀 Technologies Used
- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- TestNG  
- Maven  
- Page Object Model (POM)  
- Gherkin  

## 📂 Project Structure
/src  
 └── test  
      ├── java  
      │    ├── pages/  
      │    ├── stepDefinitions/  
      │    ├── runners/  
      │    └── utilities/  
      └── resources  
           ├── features/  
           └── config.properties  

## 🧪 Test Scenarios
Includes **6–7 login scenarios**:

### ✔️ Positive
- Successful Login (valid username + valid password)

### ❌ Negative
- Invalid Username  
- Invalid Password  
- Invalid Username + Password  
- Empty Username  
- Empty Password  
- Empty Username & Password  

## ▶️ How to Run
### Maven
mvn clean test

### TestNG Runner
Run any runner under `runners` package.

### IDE
Run from feature file, runner class, or TestNG suite.

## 📊 Reports
Generated after execution:
- TestNG Reports → test-output/  
- Cucumber HTML Report → target/cucumber-reports/  
- Surefire Reports → target/surefire-reports/  

## ⚙️ Configuration
config.properties:
browser=chrome  
baseUrl=https://example.com  
username=testuser  
password=testpassword  

## 👨‍💻 Author
**Enes Can Ersoy** – Test Automation Engineer
