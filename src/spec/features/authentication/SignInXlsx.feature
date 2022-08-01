@signInXlsx
Feature: Je me connecte à l application OrangeHRM avec un fichier Excel
  En tant que utilisateur je souhaite m authentifier à lapplication OrangeHRM

  @signIn
  Scenario: Authentification à l application OrangeHRM
   Given Je me connecte à l application OrangeHRM
    When Je m authentifier avec un fichier excel