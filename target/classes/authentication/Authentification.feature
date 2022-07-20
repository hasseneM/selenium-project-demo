@authentification
Feature: Je me connecte à l application OrangeHRM
En tant que utilisateur je souhaite m authentifier à lapplication OrangeHRM

  @connexion_ok
  Scenario: Authentification à l application OrangeHRM
    Given Je me connecte à l application OrangeHRM
    When je saisie le username "Ad" "min"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Je me redirige vers l application Home
