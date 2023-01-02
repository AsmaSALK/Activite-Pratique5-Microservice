# Activite-Pratique5-Microservice
C'est projet qui repose sur le Pattern CQRS et Event Sourcing 
# Architecture Du Projet
CQRS, pour Command Query Responsibility Segregation est une architecture logiciel qui repose sur un principe simple : la séparation, au sein d’une application, des composants de modification et de restitution de l’information sous les termes Command (pour l’écriture) et Query (pour la lecture).
![image](https://user-images.githubusercontent.com/85801662/209577641-c635ce54-84c4-4f09-a75c-8a3024b3e762.png)
# Création des Packages 
CQRS signifie Command Query Responsibility Segregation, ce qui signifie Séparation des Responsabilités de Commande et de Requête. C'est un patron de conception qui consiste à séparer les responsabilités de modification d'état (commandes) et de lecture d'état (requêtes) dans une application.

L'idée derrière CQRS est de séparer les responsabilités de modification et de lecture en utilisant deux modèles de données distincts. Le modèle de commande est utilisé pour effectuer des modifications d'état, tandis que le modèle de requête est utilisé pour lire l'état. Cela peut être utile dans les cas où l'application a un grand nombre de lectures d'état par rapport aux modifications d'état, car cela permet de mieux optimiser les deux modèles de données pour leurs usages respectifs.

Event sourcing consiste à enregistrer tous les événements qui ont eu lieu dans l'application dans une séquence chronologique, plutôt que de simplement enregistrer l'état actuel de l'application. Cela permet de conserver une trace complète de l'historique de l'application et de reconstituer l'état actuel à partir de ces événements.

L'utilisation conjointe de CQRS et de l'event sourcing peut être utile dans les cas où il est important de pouvoir reconstituer l'état de l'application à des points précis dans le temps et de disposer d'une vue complète de l'historique des événements qui ont conduit à l'état actuel de l'application.
![image](https://user-images.githubusercontent.com/85801662/209577784-4d257f3c-7e87-4cc8-88ea-2acee64a869b.png)
![image](https://user-images.githubusercontent.com/85801662/209577819-955c5f5e-c355-4dbc-b9f8-ffa61d851e37.png)
# Commands
Le modèle de commande dans CQRS est chargé de recevoir et de traiter les commandes, c'est-à-dire les actions qui modifient l'état de l'application. Une commande est généralement représentée par une structure de données contenant les informations nécessaires pour effectuer l'action.
![image](https://user-images.githubusercontent.com/85801662/209577994-cf1aaa93-babc-423a-8b87-9a9935da0deb.png)
![image](https://user-images.githubusercontent.com/85801662/209578025-e18e5382-d2da-4868-89ea-1c5a9dfde850.png)
![image](https://user-images.githubusercontent.com/85801662/209578117-7ad01ead-def4-44ac-907c-1aa45dc02752.png)
![image](https://user-images.githubusercontent.com/85801662/209578137-38e18c81-931b-43e4-8325-65dcfcdb1b76.png)
![image](https://user-images.githubusercontent.com/85801662/209578371-3bcb0f22-d1f7-4d4b-b899-336eaf44728c.png)
![image](https://user-images.githubusercontent.com/85801662/209578458-0a0e13e6-0d62-4367-89bc-c0a0dcd5c91d.png)


# Query 
Le modèle de requête dans CQRS est chargé de fournir des données à l'utilisateur ou à d'autres parties du système. Il s'agit généralement d'un modèle de données optimisé pour la lecture et qui permet d'accéder rapidement aux données nécessaires.
![image](https://user-images.githubusercontent.com/85801662/209578492-bbd7521f-5473-4427-a8f8-5d113e3363ea.png)
![image](https://user-images.githubusercontent.com/85801662/209578527-c06998e7-1ede-458a-9da1-949f6468ac09.png)
