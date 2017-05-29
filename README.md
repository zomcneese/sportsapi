Demo of Spring boot, Spring data, and mongo embedded.  Using sports data as an example.

Learning example

To use, clone the repo
git clone https://github.com/ergobot/sportsapi.git
Go into the directory
cd sportsapi
Start the application
gradle bootRun

To view the data, go to your browser, postman, or curls
find players by number
http://localhost:8080/player/number?number=11
find players by case insensitive partial or full name
http://localhost:8080/player/name?name=dave
find players by case insensitive player's team name
http://localhost:8080/player/team/name?name=alpha
find players by case insensitive player's team city
http://localhost:8080/player/team/city?city=seaside
find players by case insensitive player's team state
http://localhost:8080/player/team/state?state=texas


update and delete examples are in PlayerController.java

