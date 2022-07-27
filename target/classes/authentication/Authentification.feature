@authentification
Feature: Je me connecte à l application OrangeHRM
  En tant que utilisateur je souhaite m authentifier à lapplication OrangeHRM

  Background: 
    Given Je me connecte à l application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login

  @connexion_ok
  Scenario: Authentification à l application OrangeHRM
    Then Je me redirige vers l application Home "Welcome"

  @deconnexion
  Scenario: Verifier la deconnexion
    When Je clique sur l icone logout
    And Je clique sur le boutton logout