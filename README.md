# ap-lab11

## Overview
At the moment, the app contains:
- The classes Game and Player, each modeling a database entity; the *games* and *players* tables, respectively, in a PostgreSQL database (MusicAlbums from previous laboratories)
- The PlayerController class acting as the REST controller, using the JpaRepository interface for querying the database

## Compulsory
The tasks are:
- Create a Spring Boot project containing the REST services for communicating with the database.
- Create the classes *Game* and *Player*.
- Create a REST controller containing methods for:
  - obtaining the list of the players, via a HTTP GET request.
  - adding a new player in the database, via a HTTP POST request.
  - modifying the name of a player, via a HTTP PUT request.
  - deleting a player, via a HTTP DELETE request. 
- Test your services using the browser and/or [Postman](https://www.postman.com/). 