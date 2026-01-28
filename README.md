# Links.hr Automated Testing

Projekt predstavlja okvir za automatsko testiranje web aplikacije **Links.hr** korištenjem Selenium WebDrivera i TestNG-a.  

---

## Tehnologije
- Java 11
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA

---

## Arhitektura
Projekt koristi **Page Object Model (POM)** arhitekturu uz primjenu explicit wait mehanizama.

---

## Testni slučajevi
- **TC01** – Otvaranje početne stranice
- **TC02** – Pretraživanje proizvoda s rezultatima
- **TC03** – Pretraživanje bez rezultata
- **TC04** – Otvaranje proizvoda iz rezultata pretrage
- **TC05** – Dodavanje proizvoda u košaricu 

---

## Wait i stabilnost
Za stabilnost testova koriste se **explicit waits (WebDriverWait)** te automatsko prihvaćanje cookie popupa.

---

## Pokretanje testova
Testovi se mogu pokretati:
- pojedinačno putem IntelliJ IDEA
- putem TestNG suite konfiguracije (`testng.xml`)

---

## .gitignore
Projekt sadrži `.gitignore` datoteku koja isključuje Maven i IntelliJ konfiguracijske datoteke.
