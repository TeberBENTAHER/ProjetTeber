#Author: Teber Ben Taher

Feature: Orange Login

Background:
Given Administrateur sur la page authentification
  
  Scenario: Connexion correct
    
    When Entrer le nom "Admin" et le MDP correct "admin123"
    Then Administrateur deriger vers la page accueil qui contient le message "Dashboard"

Scenario: Connexion incorrect
When Entrer le nom "Admin" et le MDP incorrect "adminadmin"
Then Administrateur est encore dans la page Login qui contient le message "Invalid credentials"
