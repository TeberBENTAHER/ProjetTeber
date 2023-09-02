#Author: Teber Ben Taher
Feature: Consultation des menus de home page

  Background: 
    Given Utilisateur est bien connectee avec nom correct "Admin" et mdp correct "admin123"

  Scenario Outline: Acceder aus page de chaque menu de la page home
    When Utilisateur clique sur le "<menu>"
    Then La page de menu est affichee

    Examples: 
      | menu  |
      | Admin |
      | PIM   |
