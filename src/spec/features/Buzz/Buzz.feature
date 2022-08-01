@buzz
Feature: Saisir un message dans le module Buzz de l application OrangeHRM
  En tant que utilisateur je souhaite poster un message Buzz

  @post
  Scenario: Saisir un message dans le module Buzz de l application OrangeHRM
    Given Je me connecte à l application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Je clique sur le module Buzz
    And Je saisis un message dans le champ mind
    And Je clique sur le bouton post
    And Je verifie l affichage de message
    Then Je me redirige vers l application Home "Welcome"
    When Je clique sur l icone logout
    And Je clique sur le boutton logout
