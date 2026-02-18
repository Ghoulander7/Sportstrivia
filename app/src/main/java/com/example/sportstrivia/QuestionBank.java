package com.example.sportstrivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class QuestionBank {

    private List<Question> questions;

    public QuestionBank() {
        questions = new ArrayList<>();
        loadBaseballQuestions();
        loadFootballQuestions();
    }

    public List<Question> getShuffledQuestions(Set<String> flaggedQuestions) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : questions) {
            if (!flaggedQuestions.contains(q.getQuestionText())) {
                filtered.add(q);
            }
        }
        Collections.shuffle(filtered);
        return filtered;
    }

    private void loadBaseballQuestions() {
        // === ALL-TIME CAREER RECORDS ===

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career home run record with 762 home runs?",
                new String[]{"Hank Aaron", "Babe Ruth", "Barry Bonds", "Alex Rodriguez"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career hits record with 4,256 hits?",
                new String[]{"Ty Cobb", "Pete Rose", "Hank Aaron", "Stan Musial"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career strikeouts record for pitchers with 5,714 strikeouts?",
                new String[]{"Roger Clemens", "Randy Johnson", "Steve Carlton", "Nolan Ryan"}, 3));

        questions.add(new Question("Baseball",
                "Which pitcher holds the MLB all-time career wins record with 511 victories?",
                new String[]{"Walter Johnson", "Cy Young", "Grover Alexander", "Christy Mathewson"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career stolen bases record with 1,406 steals?",
                new String[]{"Lou Brock", "Ty Cobb", "Rickey Henderson", "Tim Raines"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career saves record with 652 saves?",
                new String[]{"Trevor Hoffman", "Mariano Rivera", "Lee Smith", "Craig Kimbrel"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career RBI record with 2,297 RBIs?",
                new String[]{"Babe Ruth", "Albert Pujols", "Hank Aaron", "Alex Rodriguez"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the highest career batting average in MLB history at .366?",
                new String[]{"Rogers Hornsby", "Joe Jackson", "Ted Williams", "Ty Cobb"}, 3));

        questions.add(new Question("Baseball",
                "Which pitcher holds the lowest career ERA in MLB history at 1.82?",
                new String[]{"Addie Joss", "Walter Johnson", "Ed Walsh", "Christy Mathewson"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career runs scored record with 2,295 runs?",
                new String[]{"Hank Aaron", "Rickey Henderson", "Babe Ruth", "Barry Bonds"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career walks record with 2,558 bases on balls?",
                new String[]{"Babe Ruth", "Ted Williams", "Barry Bonds", "Rickey Henderson"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career doubles record with 792?",
                new String[]{"Ty Cobb", "Pete Rose", "Tris Speaker", "Stan Musial"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career triples record with 309?",
                new String[]{"Sam Crawford", "Ty Cobb", "Honus Wagner", "Jake Beckley"}, 0));

        questions.add(new Question("Baseball",
                "Who holds the MLB career record for games played with 3,562?",
                new String[]{"Hank Aaron", "Carl Yastrzemski", "Pete Rose", "Cal Ripken Jr."}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB career record for complete games by a pitcher with 749?",
                new String[]{"Walter Johnson", "Cy Young", "Pud Galvin", "Grover Alexander"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB career record for shutouts by a pitcher with 110?",
                new String[]{"Cy Young", "Walter Johnson", "Grover Alexander", "Christy Mathewson"}, 1));

        // === SINGLE-SEASON RECORDS ===

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season home run record with 73 home runs in 2001?",
                new String[]{"Mark McGwire", "Sammy Sosa", "Babe Ruth", "Barry Bonds"}, 3));

        questions.add(new Question("Baseball",
                "Who set the MLB single-season hits record with 262 hits in 2004?",
                new String[]{"Pete Rose", "George Sisler", "Ichiro Suzuki", "Wade Boggs"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season stolen bases record with 130 steals in 1982?",
                new String[]{"Lou Brock", "Vince Coleman", "Rickey Henderson", "Tim Raines"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season RBI record with 191 RBIs in 1930?",
                new String[]{"Lou Gehrig", "Hack Wilson", "Babe Ruth", "Jimmie Foxx"}, 1));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season batting average record (modern era) at .424 in 1924?",
                new String[]{"Ty Cobb", "George Sisler", "Rogers Hornsby", "Ted Williams"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season strikeout record for pitchers with 383 Ks in 2001?",
                new String[]{"Nolan Ryan", "Sandy Koufax", "Randy Johnson", "Pedro Martinez"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season wins record for pitchers with 41 wins in 1904?",
                new String[]{"Christy Mathewson", "Cy Young", "Joe McGinnity", "Jack Chesbro"}, 3));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season saves record with 62 saves in 2008?",
                new String[]{"Mariano Rivera", "Trevor Hoffman", "Francisco Rodriguez", "Eric Gagne"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the MLB single-season walks record with 232 walks in 2004?",
                new String[]{"Ted Williams", "Babe Ruth", "Barry Bonds", "Mark McGwire"}, 2));

        questions.add(new Question("Baseball",
                "Who set the MLB single-season runs scored record with 177 runs in 1921?",
                new String[]{"Babe Ruth", "Lou Gehrig", "Billy Hamilton", "Ted Williams"}, 0));

        // === FAMOUS STREAKS AND MILESTONES ===

        questions.add(new Question("Baseball",
                "Who holds the MLB record for the longest hitting streak at 56 consecutive games?",
                new String[]{"Ted Williams", "Pete Rose", "Ty Cobb", "Joe DiMaggio"}, 3));

        questions.add(new Question("Baseball",
                "Who holds the record for most consecutive games played with 2,632?",
                new String[]{"Lou Gehrig", "Cal Ripken Jr.", "Pete Rose", "Everett Scott"}, 1));

        questions.add(new Question("Baseball",
                "Which pitcher threw a perfect game in the 1956 World Series?",
                new String[]{"Whitey Ford", "Bob Gibson", "Don Larsen", "Sandy Koufax"}, 2));

        questions.add(new Question("Baseball",
                "Who threw the only no-hitter in World Series history?",
                new String[]{"Sandy Koufax", "Don Larsen", "Bob Gibson", "Nolan Ryan"}, 1));

        questions.add(new Question("Baseball",
                "Which pitcher holds the record for most career no-hitters with 7?",
                new String[]{"Sandy Koufax", "Bob Feller", "Cy Young", "Nolan Ryan"}, 3));

        questions.add(new Question("Baseball",
                "Who was the last player to hit .400 in a season, batting .406 in 1941?",
                new String[]{"Joe DiMaggio", "Ted Williams", "Rogers Hornsby", "Stan Musial"}, 1));

        questions.add(new Question("Baseball",
                "Who hit 61 home runs in 1961, breaking Babe Ruth's single-season record at the time?",
                new String[]{"Mickey Mantle", "Roger Maris", "Harmon Killebrew", "Willie Mays"}, 1));

        // === WORLD SERIES AND CHAMPIONSHIPS ===

        questions.add(new Question("Baseball",
                "Which MLB team has won the most World Series titles with 27 championships?",
                new String[]{"St. Louis Cardinals", "Boston Red Sox", "New York Yankees", "Los Angeles Dodgers"}, 2));

        questions.add(new Question("Baseball",
                "Which team broke the 'Curse of the Bambino' by winning the 2004 World Series?",
                new String[]{"Chicago Cubs", "Cleveland Indians", "Boston Red Sox", "Chicago White Sox"}, 2));

        questions.add(new Question("Baseball",
                "Which team ended a 108-year championship drought by winning the 2016 World Series?",
                new String[]{"Cleveland Indians", "Chicago Cubs", "Boston Red Sox", "Texas Rangers"}, 1));

        questions.add(new Question("Baseball",
                "Which team won back-to-back World Series in 1992 and 1993?",
                new String[]{"Atlanta Braves", "Toronto Blue Jays", "Minnesota Twins", "Oakland Athletics"}, 1));

        questions.add(new Question("Baseball",
                "Which team won five consecutive World Series from 1949 to 1953?",
                new String[]{"Brooklyn Dodgers", "Boston Red Sox", "St. Louis Cardinals", "New York Yankees"}, 3));

        questions.add(new Question("Baseball",
                "Who hit the famous 'Shot Heard Round the World' home run in 1951?",
                new String[]{"Bobby Thomson", "Willie Mays", "Jackie Robinson", "Duke Snider"}, 0));

        questions.add(new Question("Baseball",
                "Who hit the walk-off home run to win the 1993 World Series for the Blue Jays?",
                new String[]{"Roberto Alomar", "John Olerud", "Paul Molitor", "Joe Carter"}, 3));

        questions.add(new Question("Baseball",
                "Which pitcher won 3 games in the 1967 World Series for the Cardinals?",
                new String[]{"Steve Carlton", "Bob Gibson", "Sandy Koufax", "Juan Marichal"}, 1));

        // === AWARDS AND HONORS ===

        questions.add(new Question("Baseball",
                "What number is retired across all of Major League Baseball in honor of Jackie Robinson?",
                new String[]{"21", "42", "44", "7"}, 1));

        questions.add(new Question("Baseball",
                "Which player won the most career MVP awards with 7?",
                new String[]{"Ted Williams", "Babe Ruth", "Barry Bonds", "Willie Mays"}, 2));

        questions.add(new Question("Baseball",
                "Which pitcher won the most Cy Young Awards with 7?",
                new String[]{"Greg Maddux", "Randy Johnson", "Roger Clemens", "Steve Carlton"}, 2));

        questions.add(new Question("Baseball",
                "Who won the Triple Crown in batting in 2012, the first since 1967?",
                new String[]{"Albert Pujols", "Miguel Cabrera", "Mike Trout", "Prince Fielder"}, 1));

        questions.add(new Question("Baseball",
                "Who was the first player unanimously elected to the Baseball Hall of Fame?",
                new String[]{"Babe Ruth", "Ty Cobb", "Honus Wagner", "Ken Griffey Jr."}, 3));

        // === GENERAL KNOWLEDGE AND HISTORY ===

        questions.add(new Question("Baseball",
                "How many stitches are on an official Major League Baseball?",
                new String[]{"88", "108", "120", "98"}, 1));

        questions.add(new Question("Baseball",
                "What is the distance between bases on a standard baseball diamond?",
                new String[]{"80 feet", "90 feet", "100 feet", "85 feet"}, 1));

        questions.add(new Question("Baseball",
                "What is the distance from the pitching rubber to home plate?",
                new String[]{"55 feet", "60 feet 6 inches", "62 feet", "58 feet"}, 1));

        questions.add(new Question("Baseball",
                "In what year was the first official World Series played?",
                new String[]{"1900", "1903", "1910", "1895"}, 1));

        questions.add(new Question("Baseball",
                "What is the 'Green Monster' in Fenway Park?",
                new String[]{"The scoreboard", "The left field wall", "The mascot", "The dugout"}, 1));

        questions.add(new Question("Baseball",
                "Which MLB stadium is known as 'The Friendly Confines'?",
                new String[]{"Fenway Park", "Yankee Stadium", "Wrigley Field", "Dodger Stadium"}, 2));

        questions.add(new Question("Baseball",
                "In what year did Jackie Robinson break the MLB color barrier?",
                new String[]{"1945", "1947", "1950", "1942"}, 1));

        questions.add(new Question("Baseball",
                "What does 'ERA' stand for in baseball statistics?",
                new String[]{"Earned Run Average", "Extra Runs Allowed", "Earned Runs Accumulated", "Error Rate Average"}, 0));

        questions.add(new Question("Baseball",
                "What is a 'cycle' in baseball?",
                new String[]{"Pitching a complete game shutout", "Hitting a single, double, triple, and home run in one game", "Turning three double plays in one game", "Striking out four times in one game"}, 1));

        questions.add(new Question("Baseball",
                "Which team plays its home games at Wrigley Field?",
                new String[]{"Chicago White Sox", "St. Louis Cardinals", "Chicago Cubs", "Milwaukee Brewers"}, 2));

        questions.add(new Question("Baseball",
                "What is the minimum number of pitches a pitcher can throw in a complete game?",
                new String[]{"27", "54", "81", "9"}, 0));

        questions.add(new Question("Baseball",
                "Who is known as 'The Sultan of Swat'?",
                new String[]{"Lou Gehrig", "Babe Ruth", "Ty Cobb", "Mickey Mantle"}, 1));

        questions.add(new Question("Baseball",
                "Who is known as 'The Say Hey Kid'?",
                new String[]{"Mickey Mantle", "Hank Aaron", "Willie Mays", "Roberto Clemente"}, 2));

        questions.add(new Question("Baseball",
                "Which player was known as 'Mr. October' for his World Series heroics?",
                new String[]{"Pete Rose", "Reggie Jackson", "Derek Jeter", "Dave Winfield"}, 1));

        questions.add(new Question("Baseball",
                "What is the maximum number of players on an MLB active roster during the regular season?",
                new String[]{"25", "26", "28", "30"}, 1));

        questions.add(new Question("Baseball",
                "Which position is designated by the number 6 in baseball scorekeeping?",
                new String[]{"Third baseman", "Second baseman", "Shortstop", "Left fielder"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'WHIP' in baseball pitching statistics?",
                new String[]{"Wins to Hits Innings Pitched", "Walks plus Hits per Inning Pitched", "Win-Hold Index Performance", "Weighted Hits In Play"}, 1));

        questions.add(new Question("Baseball",
                "How many innings are in a standard regulation MLB game?",
                new String[]{"7", "8", "9", "10"}, 2));

        questions.add(new Question("Baseball",
                "Who famously called his shot by pointing to center field before homering in the 1932 World Series?",
                new String[]{"Lou Gehrig", "Joe DiMaggio", "Babe Ruth", "Jimmie Foxx"}, 2));

        questions.add(new Question("Baseball",
                "What is the 'infield fly rule' designed to prevent?",
                new String[]{"Home runs off pop flies", "Pitchers throwing at batters", "Fielders intentionally dropping a pop-up for a double play", "Runners stealing bases on pop-ups"}, 2));

        questions.add(new Question("Baseball",
                "Which MLB team was originally called the 'Highlanders'?",
                new String[]{"Boston Red Sox", "New York Yankees", "Chicago White Sox", "Detroit Tigers"}, 1));

        questions.add(new Question("Baseball",
                "Roberto Clemente tragically died in a plane crash delivering aid to which country?",
                new String[]{"Puerto Rico", "Dominican Republic", "Nicaragua", "Honduras"}, 2));

        questions.add(new Question("Baseball",
                "Who threw the fastest pitch ever officially recorded in MLB at 105.8 mph?",
                new String[]{"Nolan Ryan", "Randy Johnson", "Aroldis Chapman", "Joel Zumaya"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'grand slam' in baseball?",
                new String[]{"Hitting four home runs in one game", "A home run with the bases loaded", "Winning the World Series in four straight games", "Striking out the side on nine pitches"}, 1));

        questions.add(new Question("Baseball",
                "Which team moved from Brooklyn to Los Angeles in 1958?",
                new String[]{"Giants", "Dodgers", "Mets", "Athletics"}, 1));

        questions.add(new Question("Baseball",
                "Who was the first designated hitter in MLB history?",
                new String[]{"Ron Blomberg", "Frank Robinson", "Orlando Cepeda", "Hal McRae"}, 0));

        questions.add(new Question("Baseball",
                "What is the 'Mendoza Line' in baseball?",
                new String[]{"A .300 batting average", "A .200 batting average", "The foul line", "100 strikeouts in a season"}, 1));

        questions.add(new Question("Baseball",
                "Who caught the final out of the 1954 World Series with an iconic over-the-shoulder catch?",
                new String[]{"Joe DiMaggio", "Roberto Clemente", "Willie Mays", "Mickey Mantle"}, 2));

        // === ADDITIONAL BASEBALL QUESTIONS ===

        // --- Legendary Players ---

        questions.add(new Question("Baseball",
                "Which pitcher won 3 Cy Young Awards and was known as 'The Big Unit'?",
                new String[]{"Roger Clemens", "Randy Johnson", "Pedro Martinez", "Greg Maddux"}, 1));

        questions.add(new Question("Baseball",
                "Who was the first African American to win the Cy Young Award?",
                new String[]{"Bob Gibson", "Don Newcombe", "Satchel Paige", "Fergie Jenkins"}, 1));

        questions.add(new Question("Baseball",
                "Which player ended his career with exactly 3,000 hits and was killed in a plane crash?",
                new String[]{"Thurman Munson", "Roberto Clemente", "Lou Gehrig", "Kirby Puckett"}, 1));

        questions.add(new Question("Baseball",
                "Who was known as 'The Iron Horse' for his consecutive games streak?",
                new String[]{"Cal Ripken Jr.", "Lou Gehrig", "Pete Rose", "Brooks Robinson"}, 1));

        questions.add(new Question("Baseball",
                "Which player hit a home run in his final career at-bat in 1960?",
                new String[]{"Mickey Mantle", "Babe Ruth", "Ted Williams", "Willie Mays"}, 2));

        questions.add(new Question("Baseball",
                "Who was known as 'Charlie Hustle'?",
                new String[]{"Ty Cobb", "Pete Rose", "Joe DiMaggio", "Rickey Henderson"}, 1));

        questions.add(new Question("Baseball",
                "Which pitcher was nicknamed 'The Rocket'?",
                new String[]{"Nolan Ryan", "Roger Clemens", "Randy Johnson", "Pedro Martinez"}, 1));

        questions.add(new Question("Baseball",
                "Who was known as 'The Kid' and hit 630 career home runs?",
                new String[]{"Alex Rodriguez", "Manny Ramirez", "Ken Griffey Jr.", "Frank Thomas"}, 2));

        questions.add(new Question("Baseball",
                "Who was the first player to hit 500 home runs and steal 500 bases?",
                new String[]{"Barry Bonds", "Willie Mays", "Alex Rodriguez", "No one has done this"}, 3));

        questions.add(new Question("Baseball",
                "Which pitcher was known as 'Mad Dog' and won 4 consecutive Cy Young Awards?",
                new String[]{"Randy Johnson", "Pedro Martinez", "Roger Clemens", "Greg Maddux"}, 3));

        questions.add(new Question("Baseball",
                "Who hit 755 career home runs before Barry Bonds broke his record?",
                new String[]{"Babe Ruth", "Willie Mays", "Hank Aaron", "Frank Robinson"}, 2));

        questions.add(new Question("Baseball",
                "Which player was known as 'The Splendid Splinter'?",
                new String[]{"Joe DiMaggio", "Stan Musial", "Ted Williams", "Mickey Mantle"}, 2));

        questions.add(new Question("Baseball",
                "Which Hall of Fame catcher was nicknamed 'Pudge'?",
                new String[]{"Johnny Bench", "Carlton Fisk", "Ivan Rodriguez", "Yogi Berra"}, 2));

        questions.add(new Question("Baseball",
                "Who was known as 'Stan the Man'?",
                new String[]{"Stan Musial", "Stan Hack", "Stan Coveleski", "Stan Bahnsen"}, 0));

        questions.add(new Question("Baseball",
                "Which pitcher earned the nickname 'Big Sexy'?",
                new String[]{"CC Sabathia", "David Wells", "Bartolo Colon", "Livan Hernandez"}, 2));

        // --- Famous Moments and Plays ---

        questions.add(new Question("Baseball",
                "In what year did Bill Buckner's infamous error occur in the World Series?",
                new String[]{"1984", "1986", "1988", "1990"}, 1));

        questions.add(new Question("Baseball",
                "Who hit the walk-off home run to win Game 7 of the 2001 World Series for the Diamondbacks?",
                new String[]{"Luis Gonzalez", "Matt Williams", "Craig Counsell", "Curt Schilling"}, 0));

        questions.add(new Question("Baseball",
                "Which pitcher's bloody sock became iconic in the 2004 ALCS?",
                new String[]{"Pedro Martinez", "Derek Lowe", "Curt Schilling", "Tim Wakefield"}, 2));

        questions.add(new Question("Baseball",
                "Who caught the final out of Don Larsen's perfect game in the 1956 World Series?",
                new String[]{"Elston Howard", "Yogi Berra", "Bill Dickey", "Thurman Munson"}, 1));

        questions.add(new Question("Baseball",
                "Which player hit the 'Pine Tar Game' home run that was initially called out in 1983?",
                new String[]{"George Brett", "Hal McRae", "Willie Wilson", "Frank White"}, 0));

        questions.add(new Question("Baseball",
                "Who hit the game-winning home run in Game 1 of the 1988 World Series despite being injured?",
                new String[]{"Orel Hershiser", "Steve Sax", "Kirk Gibson", "Mickey Hatcher"}, 2));

        questions.add(new Question("Baseball",
                "Who hit three home runs in Game 6 of the 1977 World Series?",
                new String[]{"Thurman Munson", "Reggie Jackson", "Chris Chambliss", "Graig Nettles"}, 1));

        questions.add(new Question("Baseball",
                "Which team completed the largest comeback in postseason history, trailing 3-0 in the 2004 ALCS?",
                new String[]{"New York Yankees", "Boston Red Sox", "Minnesota Twins", "Anaheim Angels"}, 1));

        questions.add(new Question("Baseball",
                "Who was on deck when Bill Mazeroski hit the walk-off HR to win the 1960 World Series?",
                new String[]{"Roberto Clemente", "Mickey Mantle", "Dick Groat", "Yogi Berra"}, 2));

        questions.add(new Question("Baseball",
                "Who hit the first home run in All-Star Game history in 1933?",
                new String[]{"Lou Gehrig", "Babe Ruth", "Jimmie Foxx", "Al Simmons"}, 1));

        // --- Team History and Franchises ---

        questions.add(new Question("Baseball",
                "Which MLB team has the longest World Series drought among current franchises that have won one?",
                new String[]{"Cleveland Guardians", "Milwaukee Brewers", "Seattle Mariners", "Texas Rangers"}, 0));

        questions.add(new Question("Baseball",
                "Which team was formerly known as the Montreal Expos?",
                new String[]{"Miami Marlins", "Tampa Bay Rays", "Washington Nationals", "Colorado Rockies"}, 2));

        questions.add(new Question("Baseball",
                "In what year did the American League adopt the designated hitter rule?",
                new String[]{"1969", "1973", "1976", "1980"}, 1));

        questions.add(new Question("Baseball",
                "Which MLB team plays home games at Dodger Stadium, the largest stadium in MLB?",
                new String[]{"New York Yankees", "New York Mets", "San Francisco Giants", "Los Angeles Dodgers"}, 3));

        questions.add(new Question("Baseball",
                "Which is the oldest currently-used ballpark in Major League Baseball?",
                new String[]{"Wrigley Field", "Fenway Park", "Dodger Stadium", "Yankee Stadium"}, 1));

        questions.add(new Question("Baseball",
                "Which team won the World Series in 2005, ending an 88-year championship drought?",
                new String[]{"Boston Red Sox", "Chicago Cubs", "Chicago White Sox", "Houston Astros"}, 2));

        questions.add(new Question("Baseball",
                "Which two teams played in the first MLB night game in 1935?",
                new String[]{"Yankees vs. Red Sox", "Reds vs. Phillies", "Cubs vs. Cardinals", "Giants vs. Dodgers"}, 1));

        questions.add(new Question("Baseball",
                "Which team relocated from Milwaukee to Atlanta in 1966?",
                new String[]{"Brewers", "Braves", "Twins", "Reds"}, 1));

        questions.add(new Question("Baseball",
                "Which expansion team won the World Series in only its fifth year of existence in 1997?",
                new String[]{"Arizona Diamondbacks", "Colorado Rockies", "Tampa Bay Rays", "Florida Marlins"}, 3));

        questions.add(new Question("Baseball",
                "Which team plays home games at the field nicknamed 'The Launching Pad' due to its altitude?",
                new String[]{"Arizona Diamondbacks", "Colorado Rockies", "Texas Rangers", "Kansas City Royals"}, 1));

        // --- Rules, Strategy, and Terminology ---

        questions.add(new Question("Baseball",
                "What is a 'balk' in baseball?",
                new String[]{"An illegal pitch motion by the pitcher", "A foul ball hit backwards", "A missed tag on a runner", "An out-of-bounds throw"}, 0));

        questions.add(new Question("Baseball",
                "How many balls result in a walk?",
                new String[]{"3", "4", "5", "6"}, 1));

        questions.add(new Question("Baseball",
                "What does 'OPS' stand for in baseball statistics?",
                new String[]{"On-base Plus Slugging", "Offensive Player Score", "Overall Pitching Stats", "Out-Put Score"}, 0));

        questions.add(new Question("Baseball",
                "What is a 'sacrifice fly' in baseball?",
                new String[]{"A fly out that advances a runner to score", "A bunt that moves a runner", "A fly ball caught in foul territory", "An intentional pop-up"}, 0));

        questions.add(new Question("Baseball",
                "What does 'WAR' stand for in modern baseball analytics?",
                new String[]{"Wins Above Replacement", "Win-Added Rating", "Wins After Roster", "Weighted Average Runs"}, 0));

        questions.add(new Question("Baseball",
                "What is the 'hot corner' in baseball?",
                new String[]{"Home plate", "Second base", "Third base", "The pitcher's mound"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'Texas Leaguer' in baseball?",
                new String[]{"A player from Texas", "A bloop single just over the infield", "A triple play", "A pick-off move"}, 1));

        questions.add(new Question("Baseball",
                "In baseball, what is the 'battery'?",
                new String[]{"The entire infield", "The pitcher and catcher", "The cleanup hitter", "The bullpen"}, 1));

        questions.add(new Question("Baseball",
                "What is the 'count' in baseball?",
                new String[]{"The score of the game", "The number of outs", "The balls and strikes on the batter", "The number of base runners"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'can of corn' in baseball slang?",
                new String[]{"A routine fly ball", "A fastball", "A curveball", "A ground ball"}, 0));

        questions.add(new Question("Baseball",
                "What does 'going yard' mean in baseball?",
                new String[]{"Getting ejected", "Hitting a home run", "Striking out", "Stealing a base"}, 1));

        questions.add(new Question("Baseball",
                "What is a 'golden sombrero' in baseball?",
                new String[]{"Winning the Gold Glove", "Hitting a grand slam", "Striking out four times in one game", "Hitting for the cycle"}, 2));

        questions.add(new Question("Baseball",
                "What is the 'on-deck circle' used for?",
                new String[]{"Where the umpire stands", "Where the next batter warms up", "Where the coach signals", "Where pitchers warm up"}, 1));

        questions.add(new Question("Baseball",
                "What is a 'punch and Judy' hitter?",
                new String[]{"A power hitter", "A switch hitter", "A contact hitter with little power", "A pinch hitter"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'twin killing' in baseball?",
                new String[]{"Two home runs in a row", "A double play", "Two strikeouts in a row", "Two errors in one play"}, 1));

        // --- Pitching and Defense ---

        questions.add(new Question("Baseball",
                "What is a 'knuckleball'?",
                new String[]{"A pitch thrown with the knuckles to minimize spin", "A fast pitch aimed at the hands", "A type of curveball", "A pitch that bounces before home plate"}, 0));

        questions.add(new Question("Baseball",
                "Which famous knuckleball pitcher won 318 career games?",
                new String[]{"Tim Wakefield", "Phil Niekro", "R.A. Dickey", "Charlie Hough"}, 1));

        questions.add(new Question("Baseball",
                "What is a 'perfect game' in baseball?",
                new String[]{"No runs allowed", "No hits allowed", "No batter reaches base for the entire game", "Striking out every batter"}, 2));

        questions.add(new Question("Baseball",
                "How many perfect games have been thrown in MLB history?",
                new String[]{"10", "16", "23", "30"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'quality start' in baseball?",
                new String[]{"A win", "Pitching at least 6 innings with 3 or fewer earned runs", "A shutout", "Pitching a complete game"}, 1));

        questions.add(new Question("Baseball",
                "What is a 'closer' in baseball?",
                new String[]{"The first pitcher in a game", "A reliever who finishes the game to preserve a lead", "The catcher", "A utility player"}, 1));

        questions.add(new Question("Baseball",
                "Who popularized the split-finger fastball as a dominant pitch?",
                new String[]{"Nolan Ryan", "Roger Clemens", "Bruce Sutter", "Mariano Rivera"}, 2));

        questions.add(new Question("Baseball",
                "What pitch was Mariano Rivera famous for throwing?",
                new String[]{"Knuckleball", "Slider", "Cut fastball", "Changeup"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'southpaw' in baseball?",
                new String[]{"A right-handed pitcher", "A left-handed pitcher", "A switch pitcher", "A relief pitcher"}, 1));

        questions.add(new Question("Baseball",
                "Which Gold Glove Award-winning third baseman was known as 'The Human Vacuum Cleaner'?",
                new String[]{"Mike Schmidt", "Brooks Robinson", "Graig Nettles", "Wade Boggs"}, 1));

        // --- All-Star Game and Events ---

        questions.add(new Question("Baseball",
                "In what year was the first MLB All-Star Game played?",
                new String[]{"1929", "1933", "1937", "1941"}, 1));

        questions.add(new Question("Baseball",
                "Who won the Home Run Derby a record 3 times?",
                new String[]{"Mark McGwire", "Sammy Sosa", "Ken Griffey Jr.", "Giancarlo Stanton"}, 2));

        questions.add(new Question("Baseball",
                "Which event determines home-field advantage in the World Series since 2017?",
                new String[]{"All-Star Game result", "Best regular-season record", "Coin toss", "Alternating leagues each year"}, 1));

        questions.add(new Question("Baseball",
                "Which MLB player was named All-Star Game MVP a record-tying 2 times?",
                new String[]{"Willie Mays", "Derek Jeter", "Mike Trout", "All of the above"}, 3));

        // --- Modern Era Stars ---

        questions.add(new Question("Baseball",
                "Which player won the AL MVP three times with the Angels?",
                new String[]{"Albert Pujols", "Shohei Ohtani", "Mike Trout", "Vladimir Guerrero"}, 2));

        questions.add(new Question("Baseball",
                "Who was the first player to win MVP in both the American and National Leagues?",
                new String[]{"Alex Rodriguez", "Barry Bonds", "Frank Robinson", "Roger Clemens"}, 2));

        questions.add(new Question("Baseball",
                "Which player hit 'The Double' to score the winning run in the 1995 ALDS for the Mariners?",
                new String[]{"Ken Griffey Jr.", "Jay Buhner", "Edgar Martinez", "Alex Rodriguez"}, 2));

        questions.add(new Question("Baseball",
                "Who was the first player to record 40 home runs and 40 stolen bases in the same season?",
                new String[]{"Barry Bonds", "Jose Canseco", "Alex Rodriguez", "Alfonso Soriano"}, 1));

        questions.add(new Question("Baseball",
                "Which shortstop was known as 'Mr. November' for his walk-off homer in the 2001 World Series?",
                new String[]{"Alex Rodriguez", "Nomar Garciaparra", "Derek Jeter", "Cal Ripken Jr."}, 2));

        questions.add(new Question("Baseball",
                "Who threw a no-hitter in his MLB debut in 1953?",
                new String[]{"Nolan Ryan", "Sandy Koufax", "Alva 'Bobo' Holloman", "Bob Feller"}, 2));

        questions.add(new Question("Baseball",
                "Which pitcher led the league in ERA seven times and was called 'Tom Terrific'?",
                new String[]{"Sandy Koufax", "Bob Gibson", "Steve Carlton", "Tom Seaver"}, 3));

        questions.add(new Question("Baseball",
                "Which switch-hitter holds the record for most career home runs by a switch hitter with 536?",
                new String[]{"Chipper Jones", "Eddie Murray", "Mickey Mantle", "Carlos Beltran"}, 2));

        questions.add(new Question("Baseball",
                "Who was the first Japanese-born position player to play in MLB?",
                new String[]{"Ichiro Suzuki", "Hideki Matsui", "So Taguchi", "Kazuo Matsui"}, 0));

        questions.add(new Question("Baseball",
                "Which pitcher threw two no-hitters in 2015?",
                new String[]{"Clayton Kershaw", "Chris Sale", "Jake Arrieta", "Max Scherzer"}, 3));

        // --- Miscellaneous Baseball Knowledge ---

        questions.add(new Question("Baseball",
                "What is the 'seventh-inning stretch'?",
                new String[]{"A mandatory pitching change", "A tradition where fans stand and stretch between halves of the 7th inning", "A relief pitcher warming up", "The 7th inning break for TV"}, 1));

        questions.add(new Question("Baseball",
                "What song is traditionally sung during the seventh-inning stretch?",
                new String[]{"The Star-Spangled Banner", "God Bless America", "Take Me Out to the Ball Game", "America the Beautiful"}, 2));

        questions.add(new Question("Baseball",
                "What is the 'bullpen' in baseball?",
                new String[]{"The dugout", "The area where relief pitchers warm up", "The outfield bleachers", "The batting cage"}, 1));

        questions.add(new Question("Baseball",
                "How many teams are currently in Major League Baseball?",
                new String[]{"28", "30", "32", "34"}, 1));

        questions.add(new Question("Baseball",
                "Which city has hosted two MLB teams the longest?",
                new String[]{"Los Angeles", "New York", "Chicago", "San Francisco"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'walk-off' in baseball?",
                new String[]{"A pitcher leaving the mound", "A game-ending play by the home team in the bottom of the last inning", "An ejection", "A strikeout looking"}, 1));

        questions.add(new Question("Baseball",
                "What color is the foul pole typically painted?",
                new String[]{"White", "Red", "Yellow", "Orange"}, 2));

        questions.add(new Question("Baseball",
                "What is 'small ball' in baseball strategy?",
                new String[]{"Using bunts, steals, and contact hitting instead of power", "Playing with a smaller roster", "Using only relief pitchers", "An exhibition game format"}, 0));

        questions.add(new Question("Baseball",
                "Which MLB team has a 'Sausage Race' mascot tradition?",
                new String[]{"Cincinnati Reds", "Chicago Cubs", "Milwaukee Brewers", "St. Louis Cardinals"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'submarine' pitcher?",
                new String[]{"A pitcher who throws extremely hard", "A pitcher who throws underhanded with a very low arm slot", "A reliever who only pitches one inning", "A pitcher who throws only knuckleballs"}, 1));

        questions.add(new Question("Baseball",
                "Which team won three consecutive World Series from 1972 to 1974?",
                new String[]{"New York Yankees", "Cincinnati Reds", "Oakland Athletics", "Baltimore Orioles"}, 2));

        questions.add(new Question("Baseball",
                "What was 'Murderers' Row' in baseball history?",
                new String[]{"The 1927 Yankees' powerful lineup", "A famous prison baseball team", "The 1975 Reds' lineup", "A nickname for aggressive base runners"}, 0));

        questions.add(new Question("Baseball",
                "Which team was known as the 'Big Red Machine' in the 1970s?",
                new String[]{"St. Louis Cardinals", "Cincinnati Reds", "Philadelphia Phillies", "Boston Red Sox"}, 1));

        questions.add(new Question("Baseball",
                "Who managed the most games in MLB history with 5,357?",
                new String[]{"Tony La Russa", "Bobby Cox", "Joe Torre", "Connie Mack"}, 3));

        questions.add(new Question("Baseball",
                "What does the 'K' stand for when used in scorekeeping?",
                new String[]{"Kill", "Strikeout", "Caught looking", "Knockout"}, 1));

        questions.add(new Question("Baseball",
                "Which MLB team's fans are famous for throwing back opposing teams' home run balls?",
                new String[]{"Boston Red Sox", "New York Yankees", "Chicago Cubs", "Philadelphia Phillies"}, 2));

        questions.add(new Question("Baseball",
                "What is a 'rain delay' threshold — how long can a game be delayed before being postponed?",
                new String[]{"30 minutes", "1 hour", "There is no set limit", "2 hours"}, 2));

        questions.add(new Question("Baseball",
                "Who was the first MLB player to earn $1 million per year?",
                new String[]{"Pete Rose", "Nolan Ryan", "Reggie Jackson", "Mike Schmidt"}, 1));

        questions.add(new Question("Baseball",
                "What is a 'tagging up' in baseball?",
                new String[]{"Touching the bag after a caught fly ball before advancing", "Being tagged out", "Touching home plate", "Stepping on the pitching rubber"}, 0));

        questions.add(new Question("Baseball",
                "How many balls and strikes make a full count?",
                new String[]{"3 balls, 2 strikes", "4 balls, 3 strikes", "2 balls, 3 strikes", "3 balls, 3 strikes"}, 0));

        // === STATISTICS-BASED BASEBALL QUESTIONS ===

        // --- Batting Stats ---

        questions.add(new Question("Baseball",
                "How many career hits did Derek Jeter finish with?",
                new String[]{"2,722", "3,465", "3,000", "3,304"}, 1));

        questions.add(new Question("Baseball",
                "How many home runs did Babe Ruth hit in his career?",
                new String[]{"714", "755", "660", "630"}, 0));

        questions.add(new Question("Baseball",
                "What was Ted Williams' on-base percentage in 1941 when he hit .406?",
                new String[]{".493", ".512", ".553", ".478"}, 1));

        questions.add(new Question("Baseball",
                "How many consecutive games did Joe DiMaggio hit safely in his 1941 streak?",
                new String[]{"44", "50", "56", "61"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Willie Mays hit?",
                new String[]{"610", "630", "660", "680"}, 2));

        questions.add(new Question("Baseball",
                "What was Tony Gwynn's career batting average?",
                new String[]{".328", ".338", ".344", ".354"}, 1));

        questions.add(new Question("Baseball",
                "How many career hits did Hank Aaron accumulate?",
                new String[]{"3,000", "3,298", "3,514", "3,771"}, 3));

        questions.add(new Question("Baseball",
                "How many home runs did Mark McGwire hit in his record-breaking 1998 season?",
                new String[]{"61", "66", "70", "73"}, 2));

        questions.add(new Question("Baseball",
                "What was Barry Bonds' on-base percentage in 2004 — the all-time single-season record?",
                new String[]{".529", ".559", ".582", ".609"}, 2));

        questions.add(new Question("Baseball",
                "How many career doubles did Tris Speaker hit to set the all-time record?",
                new String[]{"724", "746", "792", "810"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Sammy Sosa hit in 1998?",
                new String[]{"60", "63", "66", "70"}, 2));

        questions.add(new Question("Baseball",
                "What was Rogers Hornsby's batting average in 1924, the modern-era record?",
                new String[]{".401", ".410", ".424", ".440"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Lou Gehrig accumulate in only 17 seasons?",
                new String[]{"1,420", "1,594", "1,995", "1,839"}, 2));

        questions.add(new Question("Baseball",
                "How many total bases did Babe Ruth accumulate in his career?",
                new String[]{"4,256", "5,793", "5,100", "4,888"}, 1));

        questions.add(new Question("Baseball",
                "What is the highest single-season slugging percentage in MLB history?",
                new String[]{"Babe Ruth, 1920", "Barry Bonds, 2001", "Ted Williams, 1941", "Mark McGwire, 1998"}, 1));

        questions.add(new Question("Baseball",
                "How many career walks did Ted Williams draw?",
                new String[]{"1,590", "1,845", "2,021", "2,200"}, 2));

        questions.add(new Question("Baseball",
                "What was Ichiro Suzuki's batting average in his 2004 record-setting 262-hit season?",
                new String[]{".338", ".350", ".372", ".312"}, 0));

        questions.add(new Question("Baseball",
                "How many career extra-base hits did Hank Aaron accumulate?",
                new String[]{"1,200", "1,350", "1,477", "1,560"}, 2));

        questions.add(new Question("Baseball",
                "How many times did Babe Ruth lead the league in home runs?",
                new String[]{"8", "10", "12", "14"}, 2));

        questions.add(new Question("Baseball",
                "What was the highest single-season OPS in MLB history?",
                new String[]{"Babe Ruth, 1920", "Barry Bonds, 2004", "Ted Williams, 1941", "Barry Bonds, 2001"}, 1));

        // --- Pitching Stats ---

        questions.add(new Question("Baseball",
                "How many career wins did Walter Johnson accumulate?",
                new String[]{"300", "373", "417", "511"}, 2));

        questions.add(new Question("Baseball",
                "What was Bob Gibson's legendary ERA in 1968?",
                new String[]{"1.12", "1.35", "1.50", "0.96"}, 0));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Roger Clemens record?",
                new String[]{"3,500", "4,672", "4,136", "3,871"}, 1));

        questions.add(new Question("Baseball",
                "How many career innings did Cy Young pitch?",
                new String[]{"5,941", "6,500", "7,356", "8,100"}, 2));

        questions.add(new Question("Baseball",
                "What was Pedro Martinez's ERA in 2000 for the Red Sox?",
                new String[]{"1.74", "2.07", "1.90", "2.22"}, 0));

        questions.add(new Question("Baseball",
                "How many career losses did Cy Young accumulate along with his 511 wins?",
                new String[]{"216", "270", "316", "350"}, 2));

        questions.add(new Question("Baseball",
                "What was Sandy Koufax's ERA in his final season?",
                new String[]{"1.73", "1.92", "2.04", "1.50"}, 0));

        questions.add(new Question("Baseball",
                "How many career saves did Trevor Hoffman accumulate?",
                new String[]{"478", "524", "601", "601"}, 2));

        questions.add(new Question("Baseball",
                "How many career walks did Nolan Ryan issue — the all-time record?",
                new String[]{"1,800", "2,015", "2,795", "2,400"}, 2));

        questions.add(new Question("Baseball",
                "What was Greg Maddux's ERA during his four consecutive Cy Young seasons?",
                new String[]{"1.98", "2.15", "1.60", "2.45"}, 0));

        questions.add(new Question("Baseball",
                "How many career shutouts did Walter Johnson throw?",
                new String[]{"80", "90", "110", "100"}, 2));

        questions.add(new Question("Baseball",
                "What is the most strikeouts in a single 9-inning game by a pitcher?",
                new String[]{"Nolan Ryan", "Roger Clemens", "Sandy Koufax", "Randy Johnson"}, 1));

        questions.add(new Question("Baseball",
                "How many consecutive scoreless innings did Orel Hershiser pitch in 1988 to set the record?",
                new String[]{"49", "54", "59", "64"}, 2));

        questions.add(new Question("Baseball",
                "What was Clayton Kershaw's ERA in his 2014 Cy Young/MVP season?",
                new String[]{"1.77", "1.92", "2.10", "1.56"}, 0));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Randy Johnson record?",
                new String[]{"4,137", "4,616", "4,875", "5,100"}, 1));

        questions.add(new Question("Baseball",
                "What was Dwight Gooden's ERA in his dominant 1985 season?",
                new String[]{"1.53", "1.79", "2.01", "1.67"}, 0));

        questions.add(new Question("Baseball",
                "How many career wins did Greg Maddux accumulate?",
                new String[]{"305", "345", "355", "373"}, 2));

        questions.add(new Question("Baseball",
                "How many strikeouts did Kerry Wood record in his legendary 20-K game in 1998?",
                new String[]{"18", "19", "20", "21"}, 2));

        questions.add(new Question("Baseball",
                "What was Mariano Rivera's career ERA?",
                new String[]{"1.82", "2.21", "2.56", "1.95"}, 1));

        questions.add(new Question("Baseball",
                "How many career wins did Tom Seaver accumulate?",
                new String[]{"275", "300", "311", "325"}, 2));

        // --- Stolen Bases and Speed Stats ---

        questions.add(new Question("Baseball",
                "How many bases did Rickey Henderson steal in his record-setting 1982 season?",
                new String[]{"108", "118", "130", "140"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Lou Brock accumulate?",
                new String[]{"738", "892", "938", "1,000"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Tim Raines accumulate?",
                new String[]{"650", "708", "808", "900"}, 2));

        questions.add(new Question("Baseball",
                "What was Rickey Henderson's career on-base percentage?",
                new String[]{".342", ".375", ".401", ".420"}, 2));

        questions.add(new Question("Baseball",
                "How many stolen bases did Vince Coleman record in his 1985 rookie season?",
                new String[]{"75", "87", "100", "110"}, 3));

        // --- Postseason and World Series Stats ---

        questions.add(new Question("Baseball",
                "What is Mariano Rivera's career postseason ERA?",
                new String[]{"0.70", "1.16", "1.50", "0.95"}, 0));

        questions.add(new Question("Baseball",
                "How many career postseason home runs does Manny Ramirez hold the record with?",
                new String[]{"22", "25", "29", "33"}, 2));

        questions.add(new Question("Baseball",
                "What was Madison Bumgarner's ERA in the 2014 World Series?",
                new String[]{"0.00", "0.43", "1.03", "1.50"}, 0));

        questions.add(new Question("Baseball",
                "How many career World Series strikeouts did Whitey Ford record — the all-time record?",
                new String[]{"62", "74", "94", "85"}, 2));

        questions.add(new Question("Baseball",
                "How many World Series games did the Yankees win between 1923 and 1962?",
                new String[]{"15", "18", "20", "22"}, 2));

        questions.add(new Question("Baseball",
                "What is the most runs scored by a team in a single World Series game?",
                new String[]{"Yankees, 1960", "Red Sox, 2007", "Diamondbacks, 2001", "Cardinals, 2011"}, 0));

        questions.add(new Question("Baseball",
                "How many career postseason wins does Andy Pettitte hold the record with?",
                new String[]{"15", "19", "22", "25"}, 1));

        // --- Fielding and Miscellaneous Stats ---

        questions.add(new Question("Baseball",
                "How many consecutive errorless games did Cal Ripken Jr. play at shortstop?",
                new String[]{"70", "80", "95", "110"}, 2));

        questions.add(new Question("Baseball",
                "How many career Gold Glove Awards did Greg Maddux win?",
                new String[]{"12", "15", "18", "20"}, 2));

        questions.add(new Question("Baseball",
                "How many career Gold Glove Awards did Brooks Robinson win at third base?",
                new String[]{"10", "13", "16", "18"}, 2));

        questions.add(new Question("Baseball",
                "How many career assists does Ozzie Smith hold the record for among shortstops?",
                new String[]{"7,200", "7,800", "8,375", "9,000"}, 2));

        questions.add(new Question("Baseball",
                "What is the MLB record for most putouts in a career by an outfielder?",
                new String[]{"Tris Speaker", "Willie Mays", "Rickey Henderson", "Roberto Clemente"}, 1));

        questions.add(new Question("Baseball",
                "How many career double plays did Brooks Robinson turn at third base?",
                new String[]{"450", "520", "618", "700"}, 2));

        questions.add(new Question("Baseball",
                "How many Gold Glove Awards did Roberto Clemente win?",
                new String[]{"8", "10", "12", "14"}, 2));

        questions.add(new Question("Baseball",
                "How many career Gold Glove Awards did Ken Griffey Jr. win?",
                new String[]{"7", "10", "13", "15"}, 1));

        // --- Milestone Stats ---

        questions.add(new Question("Baseball",
                "How many players in MLB history have reached 3,000 career hits?",
                new String[]{"22", "28", "33", "40"}, 2));

        questions.add(new Question("Baseball",
                "How many players in MLB history have hit 500 or more career home runs?",
                new String[]{"20", "25", "28", "34"}, 2));

        questions.add(new Question("Baseball",
                "At what age did Satchel Paige make his MLB debut — the oldest rookie?",
                new String[]{"38", "40", "42", "44"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Albert Pujols finish with?",
                new String[]{"630", "660", "703", "720"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Alex Rodriguez hit?",
                new String[]{"630", "660", "696", "714"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Frank Robinson hit?",
                new String[]{"512", "536", "556", "586"}, 3));

        questions.add(new Question("Baseball",
                "How many career home runs did Jimmie Foxx hit?",
                new String[]{"500", "512", "534", "560"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Cal Ripken Jr. accumulate?",
                new String[]{"2,848", "3,000", "3,184", "3,465"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Bob Gibson accumulate?",
                new String[]{"2,800", "3,117", "3,300", "3,500"}, 1));

        questions.add(new Question("Baseball",
                "What was Mike Trout's OPS in his 2012 rookie season?",
                new String[]{".908", ".963", ".988", "1.012"}, 1));

        questions.add(new Question("Baseball",
                "How many consecutive seasons did Albert Pujols hit 30+ home runs to start his career?",
                new String[]{"8", "10", "12", "14"}, 2));

        questions.add(new Question("Baseball",
                "How many career grand slams did Lou Gehrig hit — the all-time record?",
                new String[]{"17", "20", "23", "25"}, 2));

        questions.add(new Question("Baseball",
                "What was Babe Ruth's career slugging percentage — the all-time record?",
                new String[]{".634", ".662", ".690", ".711"}, 2));

        questions.add(new Question("Baseball",
                "How many times was Rickey Henderson caught stealing in his career?",
                new String[]{"200", "268", "335", "400"}, 2));

        questions.add(new Question("Baseball",
                "How many career at-bats did Pete Rose accumulate — the all-time record?",
                new String[]{"12,364", "13,768", "14,053", "15,000"}, 2));

        questions.add(new Question("Baseball",
                "What was the lowest team ERA in a season since 1920?",
                new String[]{"2.42", "2.56", "2.72", "2.85"}, 2));

        questions.add(new Question("Baseball",
                "How many career games did Nolan Ryan start?",
                new String[]{"609", "665", "773", "815"}, 2));

        questions.add(new Question("Baseball",
                "How many times did Hank Aaron hit 40+ home runs in a season?",
                new String[]{"4", "6", "8", "10"}, 2));

        questions.add(new Question("Baseball",
                "What was the longest game in MLB history by innings?",
                new String[]{"Braves vs. Dodgers, 1920", "Red Sox vs. Dodgers, 2018", "White Sox vs. Brewers, 1984", "Cardinals vs. Mets, 1974"}, 0));

        questions.add(new Question("Baseball",
                "How many consecutive batting titles did Rogers Hornsby win?",
                new String[]{"4", "5", "6", "7"}, 2));

        // === 300 MORE BASEBALL QUESTIONS ===

        questions.add(new Question("Baseball",
                "Who was the first pitcher to strike out 300 batters in a season in both leagues?",
                new String[]{"Nolan Ryan", "Randy Johnson", "Roger Clemens", "Pedro Martinez"}, 1));

        questions.add(new Question("Baseball",
                "Which pitcher won 24 consecutive decisions in 1912?",
                new String[]{"Walter Johnson", "Rube Marquard", "Christy Mathewson", "Cy Young"}, 1));

        questions.add(new Question("Baseball",
                "How many career sacrifice hits did Eddie Collins accumulate — an AL record?",
                new String[]{"380", "440", "512", "560"}, 2));

        questions.add(new Question("Baseball",
                "What was the most hits in a single game by one player?",
                new String[]{"Ty Cobb", "Rennie Stennett", "Pete Rose", "Kirby Puckett"}, 1));

        questions.add(new Question("Baseball",
                "How many career pinch hits did Lenny Harris accumulate — the all-time record?",
                new String[]{"175", "190", "212", "230"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the record for most consecutive plate appearances reaching base?",
                new String[]{"Ted Williams", "Barry Bonds", "Babe Ruth", "Joey Votto"}, 1));

        questions.add(new Question("Baseball",
                "How many career intentional walks did Barry Bonds receive — the all-time record?",
                new String[]{"500", "600", "688", "750"}, 2));

        questions.add(new Question("Baseball",
                "What was the most runs scored by a team in a single inning?",
                new String[]{"Red Sox, 1953", "Yankees, 1927", "Rangers, 2007", "Dodgers, 2020"}, 0));

        questions.add(new Question("Baseball",
                "How many career hit-by-pitches did Hughie Jennings accumulate — the all-time record?",
                new String[]{"200", "245", "287", "310"}, 2));

        questions.add(new Question("Baseball",
                "Who holds the record for most times grounding into a double play in a career?",
                new String[]{"Cal Ripken Jr.", "Hank Aaron", "Albert Pujols", "Jim Rice"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most stolen bases in a single game?",
                new String[]{"Rickey Henderson", "Billy Hamilton", "Vince Coleman", "George Gore"}, 3));

        questions.add(new Question("Baseball",
                "How many career triples did Ty Cobb hit?",
                new String[]{"250", "275", "295", "315"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most home runs in a month?",
                new String[]{"16", "18", "20", "22"}, 2));

        questions.add(new Question("Baseball",
                "How many career sacrifice flies did Eddie Murray hit — the all-time record?",
                new String[]{"100", "110", "128", "140"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most total bases in a single game?",
                new String[]{"15", "16", "18", "20"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Shawn Green hit in that record-setting game in 2002?",
                new String[]{"3", "4", "5", "6"}, 1));

        questions.add(new Question("Baseball",
                "What is the record for the most consecutive games with a home run?",
                new String[]{"Mark McGwire", "Dale Long", "Don Mattingly", "Ken Griffey Jr."}, 3));

        questions.add(new Question("Baseball",
                "How many career plate appearances did Pete Rose accumulate — the all-time record?",
                new String[]{"14,500", "15,000", "15,890", "16,200"}, 2));

        questions.add(new Question("Baseball",
                "What was the highest team batting average in a single season?",
                new String[]{".301", ".310", ".319", ".325"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did the 2019 Twins hit as a team — an MLB record?",
                new String[]{"275", "290", "307", "315"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most home runs in a single postseason by a player?",
                new String[]{"Barry Bonds, 2002", "Nelson Cruz, 2011", "Carlos Beltran, 2004", "All of the above"}, 3));

        questions.add(new Question("Baseball",
                "How many innings did the longest scoreless World Series game last?",
                new String[]{"11", "12", "14", "16"}, 2));

        questions.add(new Question("Baseball",
                "What was the most runs scored in a single All-Star Game?",
                new String[]{"18", "22", "26", "30"}, 2));

        questions.add(new Question("Baseball",
                "How many career wild pitches did Nolan Ryan throw — the all-time record?",
                new String[]{"200", "240", "277", "300"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most strikeouts in a single extra-inning game by a pitcher?",
                new String[]{"Tom Cheney", "Roger Clemens", "Nolan Ryan", "Randy Johnson"}, 0));

        questions.add(new Question("Baseball",
                "How many career home runs did Ernie Banks hit?",
                new String[]{"475", "490", "512", "530"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Mike Schmidt hit?",
                new String[]{"500", "525", "548", "570"}, 2));

        questions.add(new Question("Baseball",
                "What was the most wins by a team in a single season?",
                new String[]{"108", "112", "116", "120"}, 2));

        questions.add(new Question("Baseball",
                "What was the most losses by a team in a single season?",
                new String[]{"110", "115", "120", "125"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Harmon Killebrew hit?",
                new String[]{"530", "550", "573", "600"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Rafael Palmeiro hit?",
                new String[]{"530", "550", "569", "590"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Reggie Jackson hit?",
                new String[]{"520", "540", "563", "580"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Reggie Jackson accumulate as a batter — the all-time record?",
                new String[]{"2,200", "2,400", "2,597", "2,800"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Roger Maris hit in 1961 to break Ruth's record?",
                new String[]{"58", "60", "61", "64"}, 2));

        questions.add(new Question("Baseball",
                "What was the longest professional baseball game ever by innings?",
                new String[]{"26", "29", "33", "36"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Steve Carlton accumulate?",
                new String[]{"290", "310", "329", "350"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Warren Spahn accumulate — the most by a left-hander?",
                new String[]{"330", "345", "363", "380"}, 2));

        questions.add(new Question("Baseball",
                "How many career shutouts did Grover Alexander throw?",
                new String[]{"70", "80", "90", "100"}, 2));

        questions.add(new Question("Baseball",
                "How many innings did Harvey Haddix pitch perfectly before losing in the 13th inning in 1959?",
                new String[]{"10", "11", "12", "13"}, 2));

        questions.add(new Question("Baseball",
                "What was the most strikeouts by a rookie pitcher in a season?",
                new String[]{"245", "260", "276", "290"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Eddie Mathews hit?",
                new String[]{"475", "490", "512", "530"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Mel Ott hit?",
                new String[]{"475", "495", "511", "530"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Ted Williams hit?",
                new String[]{"490", "505", "521", "540"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Babe Ruth accumulate?",
                new String[]{"1,900", "2,050", "2,214", "2,350"}, 2));

        questions.add(new Question("Baseball",
                "How many career walks did Barry Bonds draw in his record 2004 season?",
                new String[]{"180", "200", "232", "250"}, 2));

        questions.add(new Question("Baseball",
                "What was Jeff Bagwell's OPS in his 1994 MVP season?",
                new String[]{"1.050", "1.100", "1.201", "1.300"}, 2));

        questions.add(new Question("Baseball",
                "How many consecutive games did Orel Hershiser go without allowing an earned run in 1988?",
                new String[]{"6", "8", "10", "7"}, 0));

        questions.add(new Question("Baseball",
                "How many career wins did Gaylord Perry accumulate?",
                new String[]{"280", "300", "314", "330"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Early Wynn accumulate — exactly?",
                new String[]{"280", "290", "300", "310"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did Lee Smith accumulate?",
                new String[]{"420", "450", "478", "500"}, 2));

        questions.add(new Question("Baseball",
                "What was the most home runs hit by a team in a single game?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Baseball",
                "How many unassisted triple plays have occurred in MLB history?",
                new String[]{"5", "10", "15", "20"}, 2));

        questions.add(new Question("Baseball",
                "How many career errors did Herman Long commit — the all-time record for a shortstop?",
                new String[]{"800", "950", "1,096", "1,200"}, 2));

        questions.add(new Question("Baseball",
                "What was the highest slugging percentage by a pitcher in a single season?",
                new String[]{".500", ".560", ".632", ".700"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did David Ortiz hit?",
                new String[]{"480", "510", "541", "565"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Manny Ramirez hit?",
                new String[]{"510", "535", "555", "575"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Mickey Mantle hit?",
                new String[]{"490", "515", "536", "560"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Jim Thome hit?",
                new String[]{"570", "590", "612", "635"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Sammy Sosa hit?",
                new String[]{"570", "590", "609", "630"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Gary Sheffield hit?",
                new String[]{"470", "490", "509", "530"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Carlos Delgado hit?",
                new String[]{"430", "455", "473", "500"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Willie Stargell hit?",
                new String[]{"440", "460", "475", "500"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Stan Musial hit?",
                new String[]{"440", "460", "475", "500"}, 2));

        questions.add(new Question("Baseball",
                "What was Joe DiMaggio's career batting average?",
                new String[]{".305", ".315", ".325", ".340"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Chipper Jones hit?",
                new String[]{"430", "450", "468", "490"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Cap Anson accumulate — one of the early all-time leaders?",
                new String[]{"1,800", "1,950", "2,075", "2,200"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most wins in a row by a pitcher in a single season?",
                new String[]{"15", "17", "19", "21"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Don Sutton accumulate?",
                new String[]{"290", "310", "324", "340"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Phil Niekro accumulate?",
                new String[]{"280", "300", "318", "340"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Tom Seaver accumulate?",
                new String[]{"3,200", "3,400", "3,640", "3,800"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Gaylord Perry accumulate?",
                new String[]{"3,100", "3,300", "3,534", "3,700"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Bob Feller accumulate?",
                new String[]{"2,200", "2,400", "2,581", "2,750"}, 2));

        questions.add(new Question("Baseball",
                "How many career shutouts did Christy Mathewson throw?",
                new String[]{"60", "70", "79", "90"}, 2));

        questions.add(new Question("Baseball",
                "What was Sandy Koufax's career strikeout rate (K/9) in his final four seasons?",
                new String[]{"7.8", "8.5", "9.3", "10.1"}, 2));

        questions.add(new Question("Baseball",
                "How many career complete games did Bob Gibson throw?",
                new String[]{"200", "230", "255", "280"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Lefty Grove accumulate?",
                new String[]{"275", "285", "300", "310"}, 2));

        questions.add(new Question("Baseball",
                "What was Lefty Grove's career winning percentage?",
                new String[]{".620", ".650", ".680", ".710"}, 2));

        questions.add(new Question("Baseball",
                "How many consecutive hitless innings did Johnny Vander Meer pitch across two no-hitters in 1938?",
                new String[]{"14", "16", "18", "20"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Vladimir Guerrero Sr. hit?",
                new String[]{"410", "430", "449", "470"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Wade Boggs accumulate?",
                new String[]{"2,800", "2,900", "3,010", "3,150"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Rod Carew accumulate?",
                new String[]{"2,850", "2,950", "3,053", "3,150"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Ichiro Suzuki accumulate in MLB?",
                new String[]{"2,800", "2,950", "3,089", "3,200"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Paul Molitor accumulate?",
                new String[]{"3,000", "3,150", "3,319", "3,450"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Eddie Collins accumulate?",
                new String[]{"3,000", "3,150", "3,315", "3,450"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Robin Yount accumulate?",
                new String[]{"2,900", "3,050", "3,142", "3,250"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did George Brett accumulate?",
                new String[]{"2,900", "3,050", "3,154", "3,250"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Craig Biggio accumulate?",
                new String[]{"2,800", "2,950", "3,060", "3,150"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Tony Gwynn accumulate?",
                new String[]{"2,900", "3,050", "3,141", "3,250"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Bob Feller accumulate?",
                new String[]{"230", "250", "266", "285"}, 2));

        questions.add(new Question("Baseball",
                "What was the lowest WHIP in a single season?",
                new String[]{"0.650", "0.737", "0.800", "0.850"}, 1));

        questions.add(new Question("Baseball",
                "How many career saves did Dennis Eckersley accumulate?",
                new String[]{"340", "365", "390", "410"}, 2));

        questions.add(new Question("Baseball",
                "What was Dennis Eckersley's ERA in his 1992 Cy Young/MVP season?",
                new String[]{"1.60", "1.75", "1.91", "2.10"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did John Franco accumulate?",
                new String[]{"380", "400", "424", "450"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did Billy Wagner accumulate?",
                new String[]{"380", "400", "422", "445"}, 2));

        questions.add(new Question("Baseball",
                "What was Eric Gagne's consecutive saves streak — an MLB record?",
                new String[]{"60", "72", "84", "90"}, 2));

        questions.add(new Question("Baseball",
                "How many career complete games did Fergie Jenkins throw?",
                new String[]{"220", "245", "267", "290"}, 2));

        questions.add(new Question("Baseball",
                "How many seasons did Nolan Ryan lead the league in strikeouts?",
                new String[]{"7", "9", "11", "13"}, 2));

        questions.add(new Question("Baseball",
                "How many 200-hit seasons did Ichiro Suzuki have in MLB?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Baseball",
                "How many consecutive 200-hit seasons did Ichiro have to start his MLB career?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Baseball",
                "How many seasons did Pete Rose accumulate 200+ hits?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Baseball",
                "What was the most RBIs in a single game?",
                new String[]{"9", "10", "12", "14"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Mark Whiten hit in that 12-RBI game?",
                new String[]{"3", "4", "5", "6"}, 1));

        questions.add(new Question("Baseball",
                "How many career games did Brooks Robinson play?",
                new String[]{"2,500", "2,700", "2,896", "3,000"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Andre Dawson hit?",
                new String[]{"400", "420", "438", "460"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Dave Winfield hit?",
                new String[]{"430", "450", "465", "490"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Alex Rodriguez accumulate?",
                new String[]{"1,800", "1,950", "2,086", "2,200"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Jason Giambi hit?",
                new String[]{"390", "415", "440", "460"}, 2));

        questions.add(new Question("Baseball",
                "What was Nolan Ryan's career ERA?",
                new String[]{"2.76", "2.95", "3.19", "3.44"}, 2));

        questions.add(new Question("Baseball",
                "How many career hit batsmen did Gus Weyhing throw — the all-time record?",
                new String[]{"200", "240", "277", "310"}, 2));

        questions.add(new Question("Baseball",
                "What is the record for most batters hit in a single season by a pitcher?",
                new String[]{"25", "30", "35", "40"}, 3));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Joe Morgan accumulate?",
                new String[]{"550", "620", "689", "730"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Bert Campaneris accumulate?",
                new String[]{"500", "575", "649", "700"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Ty Cobb accumulate?",
                new String[]{"750", "825", "897", "950"}, 2));

        questions.add(new Question("Baseball",
                "How many times did Ty Cobb win the batting title?",
                new String[]{"8", "9", "11", "13"}, 2));

        questions.add(new Question("Baseball",
                "What was the highest on-base percentage in a single season?",
                new String[]{".540", ".575", ".609", ".640"}, 2));

        questions.add(new Question("Baseball",
                "How many career at-bats did Hank Aaron accumulate?",
                new String[]{"10,500", "11,200", "12,364", "13,000"}, 2));

        questions.add(new Question("Baseball",
                "How many career double plays did Bobby Richardson turn as a second baseman?",
                new String[]{"800", "950", "1,074", "1,200"}, 2));

        questions.add(new Question("Baseball",
                "What was the most home runs in a single World Series by a player?",
                new String[]{"3", "4", "5", "6"}, 2));

        questions.add(new Question("Baseball",
                "How many career postseason innings did Whitey Ford pitch?",
                new String[]{"110", "130", "146", "165"}, 2));

        questions.add(new Question("Baseball",
                "What was the most strikeouts in a single World Series game?",
                new String[]{"14", "15", "17", "19"}, 2));

        questions.add(new Question("Baseball",
                "How many career runs did Alex Rodriguez score?",
                new String[]{"1,800", "1,900", "2,021", "2,150"}, 2));

        questions.add(new Question("Baseball",
                "How many consecutive seasons did Willie Mays hit 20+ home runs?",
                new String[]{"13", "15", "17", "19"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Giancarlo Stanton hit in his 2017 NL MVP season?",
                new String[]{"50", "55", "59", "62"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did CC Sabathia accumulate?",
                new String[]{"220", "235", "251", "270"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did CC Sabathia accumulate?",
                new String[]{"2,700", "2,900", "3,093", "3,200"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Aaron Judge hit in his 2022 AL record-setting season?",
                new String[]{"58", "60", "62", "64"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Frank Thomas hit?",
                new String[]{"475", "500", "521", "545"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Kenny Lofton accumulate?",
                new String[]{"500", "560", "622", "680"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Roberto Alomar accumulate?",
                new String[]{"2,500", "2,600", "2,724", "2,850"}, 2));

        questions.add(new Question("Baseball",
                "What was Miguel Cabrera's batting average in his 2012 Triple Crown season?",
                new String[]{".310", ".320", ".330", ".345"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Miguel Cabrera hit in his 2012 Triple Crown season?",
                new String[]{"38", "41", "44", "48"}, 2));

        questions.add(new Question("Baseball",
                "How many RBIs did Miguel Cabrera drive in during his 2012 Triple Crown season?",
                new String[]{"125", "132", "139", "148"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Mike Piazza hit — the most by a catcher?",
                new String[]{"380", "400", "427", "450"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did John Smoltz accumulate?",
                new String[]{"190", "200", "213", "230"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did John Smoltz accumulate?",
                new String[]{"100", "125", "154", "175"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Tom Glavine accumulate?",
                new String[]{"270", "290", "305", "320"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Pedro Martinez accumulate?",
                new String[]{"190", "205", "219", "240"}, 2));

        questions.add(new Question("Baseball",
                "What was Pedro Martinez's career strikeout-to-walk ratio?",
                new String[]{"3.20", "3.65", "4.15", "4.50"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Justin Verlander accumulate through 2024?",
                new String[]{"230", "245", "262", "280"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Justin Verlander accumulate?",
                new String[]{"3,000", "3,200", "3,416", "3,600"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Carlos Beltran hit?",
                new String[]{"390", "415", "435", "460"}, 2));

        questions.add(new Question("Baseball",
                "How many career stolen bases did Carlos Beltran accumulate?",
                new String[]{"250", "280", "312", "340"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Adrián Beltré hit?",
                new String[]{"430", "455", "477", "500"}, 2));

        questions.add(new Question("Baseball",
                "How many career hits did Adrián Beltré accumulate?",
                new String[]{"2,900", "3,050", "3,166", "3,300"}, 2));

        questions.add(new Question("Baseball",
                "How many Gold Glove Awards did Adrián Beltré win at third base?",
                new String[]{"3", "4", "5", "6"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Jeff Bagwell hit?",
                new String[]{"410", "430", "449", "470"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Fred McGriff hit?",
                new String[]{"450", "475", "493", "510"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Mark McGwire hit?",
                new String[]{"540", "560", "583", "600"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Jose Bautista hit in his breakout 2010 season?",
                new String[]{"45", "48", "54", "58"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did Craig Kimbrel accumulate through 2024?",
                new String[]{"370", "395", "417", "440"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did Jonathan Papelbon accumulate?",
                new String[]{"310", "340", "368", "390"}, 2));

        questions.add(new Question("Baseball",
                "How many career saves did Joe Nathan accumulate?",
                new String[]{"330", "355", "377", "400"}, 2));

        questions.add(new Question("Baseball",
                "What was the longest hitting streak in the National League?",
                new String[]{"37", "40", "44", "48"}, 2));

        questions.add(new Question("Baseball",
                "How many consecutive games did Prince Fielder's father Cecil play?",
                new String[]{"800", "950", "1,096", "1,200"}, 2));

        questions.add(new Question("Baseball",
                "How many career doubles did Albert Pujols accumulate?",
                new String[]{"580", "630", "686", "720"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Nelson Cruz hit?",
                new String[]{"410", "440", "464", "490"}, 2));

        questions.add(new Question("Baseball",
                "How many home runs did Shohei Ohtani hit in his 2023 season?",
                new String[]{"38", "41", "44", "48"}, 2));

        questions.add(new Question("Baseball",
                "What was Shohei Ohtani's ERA as a pitcher in 2022?",
                new String[]{"1.95", "2.15", "2.33", "2.55"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Whitey Ford accumulate?",
                new String[]{"210", "220", "236", "250"}, 2));

        questions.add(new Question("Baseball",
                "What was Whitey Ford's career winning percentage?",
                new String[]{".640", ".660", ".690", ".710"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Robinson Canó hit?",
                new String[]{"290", "310", "335", "360"}, 2));

        questions.add(new Question("Baseball",
                "How many Silver Slugger Awards did Mike Trout win through 2024?",
                new String[]{"6", "7", "9", "11"}, 2));

        questions.add(new Question("Baseball",
                "What was Max Scherzer's career strikeouts total through 2024?",
                new String[]{"3,000", "3,200", "3,409", "3,600"}, 2));

        questions.add(new Question("Baseball",
                "How many career no-hitters did Sandy Koufax throw?",
                new String[]{"2", "3", "4", "5"}, 2));

        questions.add(new Question("Baseball",
                "How many career strikeouts did Sandy Koufax accumulate in only 12 seasons?",
                new String[]{"2,100", "2,250", "2,396", "2,550"}, 2));

        questions.add(new Question("Baseball",
                "How many career wins did Sandy Koufax accumulate?",
                new String[]{"140", "155", "165", "185"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Johnny Bench hit?",
                new String[]{"340", "365", "389", "410"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Johnny Bench accumulate?",
                new String[]{"1,150", "1,250", "1,376", "1,500"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Carlton Fisk hit?",
                new String[]{"330", "355", "376", "400"}, 2));

        questions.add(new Question("Baseball",
                "How many career home runs did Yogi Berra hit?",
                new String[]{"310", "335", "358", "380"}, 2));

        questions.add(new Question("Baseball",
                "How many career RBIs did Yogi Berra accumulate?",
                new String[]{"1,200", "1,320", "1,430", "1,550"}, 2));

        questions.add(new Question("Baseball",
                "How many World Series rings did Yogi Berra win?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Baseball",
                "How many career triples did Roberto Clemente hit?",
                new String[]{"130", "150", "166", "185"}, 2));

        questions.add(new Question("Baseball",
                "What was Roberto Clemente's career batting average?",
                new String[]{".299", ".308", ".317", ".328"}, 2));

        questions.add(new Question("Baseball",
                "How many batting titles did Tony Gwynn win?",
                new String[]{"5", "6", "8", "10"}, 2));
    }

    private void loadFootballQuestions() {
        // === ALL-TIME CAREER RECORDS ===

        questions.add(new Question("Football",
                "Who holds the NFL all-time career passing yards record with 89,214 yards?",
                new String[]{"Peyton Manning", "Drew Brees", "Tom Brady", "Brett Favre"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career rushing yards record with 18,355 yards?",
                new String[]{"Walter Payton", "Barry Sanders", "Emmitt Smith", "Frank Gore"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career receiving yards record with 22,895 yards?",
                new String[]{"Larry Fitzgerald", "Terrell Owens", "Randy Moss", "Jerry Rice"}, 3));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career passing touchdowns record with 649 touchdowns?",
                new String[]{"Drew Brees", "Peyton Manning", "Aaron Rodgers", "Tom Brady"}, 3));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career sacks record with 200 sacks?",
                new String[]{"Reggie White", "Bruce Smith", "Kevin Greene", "Julius Peppers"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career interceptions record with 81 interceptions?",
                new String[]{"Rod Woodson", "Night Train Lane", "Paul Krause", "Emlen Tunnell"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career receptions record with 1,549 catches?",
                new String[]{"Tony Gonzalez", "Larry Fitzgerald", "Jerry Rice", "Jason Witten"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career rushing touchdowns record with 175?",
                new String[]{"LaDainian Tomlinson", "Emmitt Smith", "Walter Payton", "Marcus Allen"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career total touchdowns record with 208?",
                new String[]{"Emmitt Smith", "LaDainian Tomlinson", "Jerry Rice", "Randy Moss"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career scoring record with 2,673 points?",
                new String[]{"Morten Andersen", "Adam Vinatieri", "Gary Anderson", "Jason Hanson"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL career record for most punt return touchdowns with 6?",
                new String[]{"Deion Sanders", "Devin Hester", "Eric Metcalf", "Jack Christiansen"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL career record for most fumble recoveries with 29?",
                new String[]{"Jim Marshall", "Jason Taylor", "Kevin Greene", "Warren Moon"}, 0));

        questions.add(new Question("Football",
                "Who holds the NFL career passer rating record (minimum 1,500 attempts) among retired QBs?",
                new String[]{"Peyton Manning", "Tom Brady", "Drew Brees", "Aaron Rodgers"}, 3));

        questions.add(new Question("Football",
                "Who holds the NFL all-time career interceptions thrown record with 336?",
                new String[]{"Vinny Testaverde", "Brett Favre", "Dan Marino", "Drew Bledsoe"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL career record for most forced fumbles with 44?",
                new String[]{"Julius Peppers", "Jason Taylor", "Robert Mathis", "John Abraham"}, 2));

        // === SINGLE-SEASON RECORDS ===

        questions.add(new Question("Football",
                "Who holds the NFL single-season passing yards record with 5,477 yards in 2013?",
                new String[]{"Drew Brees", "Tom Brady", "Patrick Mahomes", "Peyton Manning"}, 3));

        questions.add(new Question("Football",
                "Who holds the NFL single-season rushing yards record with 2,105 yards in 1984?",
                new String[]{"Barry Sanders", "Adrian Peterson", "Eric Dickerson", "Emmitt Smith"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL single-season passing touchdowns record with 55 TDs in 2013?",
                new String[]{"Tom Brady", "Patrick Mahomes", "Dan Marino", "Peyton Manning"}, 3));

        questions.add(new Question("Football",
                "Who holds the NFL single-season receiving yards record with 1,964 yards in 2012?",
                new String[]{"Jerry Rice", "Randy Moss", "Calvin Johnson", "Julio Jones"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL single-season touchdown receptions record with 23 TDs in 2007?",
                new String[]{"Jerry Rice", "Randy Moss", "Calvin Johnson", "Terrell Owens"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL single-season rushing touchdowns record with 28 TDs in 2006?",
                new String[]{"Emmitt Smith", "Shaun Alexander", "LaDainian Tomlinson", "Adrian Peterson"}, 2));

        questions.add(new Question("Football",
                "Who holds the NFL single-season sacks record with 22.5 sacks in 2001?",
                new String[]{"Reggie White", "Michael Strahan", "Jared Allen", "Justin Houston"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL single-season interceptions record with 14 in 1952?",
                new String[]{"Paul Krause", "Night Train Lane", "Lester Hayes", "Deion Sanders"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL single-season receptions record with 149 catches in 2019?",
                new String[]{"Marvin Harrison", "Michael Thomas", "Wes Welker", "Antonio Brown"}, 1));

        questions.add(new Question("Football",
                "Who holds the NFL single-season total touchdowns record with 31 in 2006?",
                new String[]{"Emmitt Smith", "Shaun Alexander", "LaDainian Tomlinson", "Marshall Faulk"}, 2));

        // === SUPER BOWL ===

        questions.add(new Question("Football",
                "Which two NFL teams are tied for the most Super Bowl wins with 6 championships each?",
                new String[]{"Cowboys & 49ers", "Patriots & Steelers", "Packers & Giants", "Cowboys & Patriots"}, 1));

        questions.add(new Question("Football",
                "Which player has won the most Super Bowl MVP awards with 5?",
                new String[]{"Joe Montana", "Patrick Mahomes", "Tom Brady", "Terry Bradshaw"}, 2));

        questions.add(new Question("Football",
                "The Super Bowl trophy is named after which legendary NFL coach?",
                new String[]{"Tom Landry", "Don Shula", "Vince Lombardi", "Paul Brown"}, 2));

        questions.add(new Question("Football",
                "Which team completed the only perfect season (including Super Bowl win) in NFL history in 1972?",
                new String[]{"Pittsburgh Steelers", "Dallas Cowboys", "Miami Dolphins", "Green Bay Packers"}, 2));

        questions.add(new Question("Football",
                "Which team won the first two Super Bowls (I and II)?",
                new String[]{"Dallas Cowboys", "Green Bay Packers", "Pittsburgh Steelers", "Kansas City Chiefs"}, 1));

        questions.add(new Question("Football",
                "What was the largest margin of victory in Super Bowl history?",
                new String[]{"35 points", "39 points", "45 points", "42 points"}, 2));

        questions.add(new Question("Football",
                "Which team overcame a 25-point deficit to win Super Bowl LI?",
                new String[]{"Philadelphia Eagles", "Kansas City Chiefs", "New York Giants", "New England Patriots"}, 3));

        questions.add(new Question("Football",
                "Who scored the first touchdown in Super Bowl history?",
                new String[]{"Max McGee", "Bart Starr", "Len Dawson", "Jim Taylor"}, 0));

        questions.add(new Question("Football",
                "Which Super Bowl featured the 'Helmet Catch' by David Tyree?",
                new String[]{"Super Bowl XL", "Super Bowl XLII", "Super Bowl XLIV", "Super Bowl XLVI"}, 1));

        questions.add(new Question("Football",
                "Who kicked the game-winning field goal in Super Bowl XXXVI for the Patriots?",
                new String[]{"Matt Stover", "Jason Elam", "Adam Vinatieri", "Morten Andersen"}, 2));

        questions.add(new Question("Football",
                "Which team lost four consecutive Super Bowls from 1991 to 1994?",
                new String[]{"Minnesota Vikings", "Denver Broncos", "Buffalo Bills", "Dallas Cowboys"}, 2));

        questions.add(new Question("Football",
                "Who threw the 'Immaculate Reception' pass in the 1972 AFC Divisional Playoff?",
                new String[]{"Joe Greene", "Terry Bradshaw", "Franco Harris", "Lynn Swann"}, 1));

        questions.add(new Question("Football",
                "Who caught the 'Immaculate Reception'?",
                new String[]{"Lynn Swann", "John Stallworth", "Franco Harris", "Rocky Bleier"}, 2));

        // === AWARDS AND HONORS ===

        questions.add(new Question("Football",
                "Who has won the most NFL MVP awards with 5?",
                new String[]{"Tom Brady", "Peyton Manning", "Jim Brown", "Johnny Unitas"}, 1));

        questions.add(new Question("Football",
                "Who was the first player to win the Heisman Trophy and Super Bowl MVP?",
                new String[]{"Roger Staubach", "Jim Plunkett", "Marcus Allen", "Desmond Howard"}, 2));

        questions.add(new Question("Football",
                "Which running back won the NFL MVP in 2012 after rushing for 2,097 yards?",
                new String[]{"Marshawn Lynch", "LeSean McCoy", "Adrian Peterson", "Arian Foster"}, 2));

        questions.add(new Question("Football",
                "Who won both the Offensive and Defensive Rookie of the Year in the same year? (Trick: no one has — who won DROY in 2003?)",
                new String[]{"Troy Polamalu", "Terrell Suggs", "Ed Reed", "Julius Peppers"}, 1));

        // === GENERAL KNOWLEDGE AND HISTORY ===

        questions.add(new Question("Football",
                "In which city is the Pro Football Hall of Fame located?",
                new String[]{"New York, NY", "Canton, OH", "Green Bay, WI", "Dallas, TX"}, 1));

        questions.add(new Question("Football",
                "How long is an NFL football field from end zone to end zone (including end zones)?",
                new String[]{"100 yards", "110 yards", "120 yards", "105 yards"}, 2));

        questions.add(new Question("Football",
                "How many players from each team are on the field during a play?",
                new String[]{"10", "11", "12", "9"}, 1));

        questions.add(new Question("Football",
                "What is the width of an NFL goal post?",
                new String[]{"14 feet 6 inches", "16 feet", "18 feet 6 inches", "20 feet"}, 2));

        questions.add(new Question("Football",
                "How many points is a safety worth?",
                new String[]{"1", "2", "3", "6"}, 1));

        questions.add(new Question("Football",
                "What year was the first NFL season played?",
                new String[]{"1910", "1915", "1920", "1925"}, 2));

        questions.add(new Question("Football",
                "Which team has appeared in the most Super Bowls overall?",
                new String[]{"Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "San Francisco 49ers"}, 1));

        questions.add(new Question("Football",
                "What is the nickname for a quarterback sack where two defenders hit the QB simultaneously?",
                new String[]{"Sandwich sack", "Pancake", "Double whammy", "None of the above — no special term"}, 0));

        questions.add(new Question("Football",
                "Which NFL team is the only one to have their logo on only one side of their helmet?",
                new String[]{"Cleveland Browns", "New York Giants", "Pittsburgh Steelers", "Green Bay Packers"}, 2));

        questions.add(new Question("Football",
                "What is the 'Lambeau Leap'?",
                new String[]{"A trick play", "A player jumping into the stands after a TD at Lambeau Field", "A halftime show tradition", "A type of hurdle move"}, 1));

        questions.add(new Question("Football",
                "Which quarterback was known as 'The Sheriff'?",
                new String[]{"Tom Brady", "Brett Favre", "Peyton Manning", "John Elway"}, 2));

        questions.add(new Question("Football",
                "Which running back was known as 'Sweetness'?",
                new String[]{"Barry Sanders", "Emmitt Smith", "Jim Brown", "Walter Payton"}, 3));

        questions.add(new Question("Football",
                "Which wide receiver was known as 'Megatron'?",
                new String[]{"Randy Moss", "Calvin Johnson", "Larry Fitzgerald", "Andre Johnson"}, 1));

        questions.add(new Question("Football",
                "Which defensive player was known as 'The Minister of Defense'?",
                new String[]{"Lawrence Taylor", "Reggie White", "Ray Lewis", "Deion Sanders"}, 1));

        questions.add(new Question("Football",
                "What is the 'Hail Mary' in football?",
                new String[]{"A trick play with a lateral", "A long desperate pass at the end of a half", "A fake punt", "A two-point conversion play"}, 1));

        questions.add(new Question("Football",
                "Which NFL team moved from St. Louis back to Los Angeles in 2016?",
                new String[]{"Chargers", "Raiders", "Rams", "Cardinals"}, 2));

        questions.add(new Question("Football",
                "Who coached the most Super Bowl-winning teams with 6 titles?",
                new String[]{"Don Shula", "Tom Landry", "Chuck Noll", "Bill Belichick"}, 3));

        questions.add(new Question("Football",
                "What was the NFL's first franchise, founded in 1920?",
                new String[]{"Chicago Bears", "Green Bay Packers", "Arizona Cardinals", "New York Giants"}, 2));

        questions.add(new Question("Football",
                "Which NFL team is the only one without a logo on their helmet?",
                new String[]{"Pittsburgh Steelers", "Cleveland Browns", "New York Jets", "Oakland Raiders"}, 1));

        questions.add(new Question("Football",
                "Who is the youngest quarterback to start and win a Super Bowl?",
                new String[]{"Patrick Mahomes", "Tom Brady", "Ben Roethlisberger", "Russell Wilson"}, 2));

        questions.add(new Question("Football",
                "How many rounds are in the modern NFL Draft?",
                new String[]{"5", "6", "7", "8"}, 2));

        questions.add(new Question("Football",
                "Which quarterback led the 'The Drive' — a 98-yard game-tying touchdown drive in the 1986 AFC Championship?",
                new String[]{"Dan Marino", "Joe Montana", "John Elway", "Phil Simms"}, 2));

        questions.add(new Question("Football",
                "What do the 'G' on the Green Bay Packers helmet stand for?",
                new String[]{"Green Bay", "Greatness", "Gridiron", "It's an oval, not a letter"}, 0));

        questions.add(new Question("Football",
                "Which team won the first AFL-NFL World Championship Game (Super Bowl I)?",
                new String[]{"Kansas City Chiefs", "Green Bay Packers", "Oakland Raiders", "New York Jets"}, 1));

        questions.add(new Question("Football",
                "Who guaranteed victory in Super Bowl III and then delivered?",
                new String[]{"Johnny Unitas", "Bart Starr", "Joe Namath", "Len Dawson"}, 2));

        questions.add(new Question("Football",
                "What is a 'pick six' in football?",
                new String[]{"Selecting the sixth pick in the draft", "An interception returned for a touchdown", "A six-point field goal", "Picking up a fumble for six yards"}, 1));

        questions.add(new Question("Football",
                "Who holds the record for the longest field goal in NFL history at 66 yards?",
                new String[]{"Matt Prater", "Tom Dempsey", "Justin Tucker", "Sebastian Janikowski"}, 2));

        questions.add(new Question("Football",
                "Which team's fans are known as the '12th Man'?",
                new String[]{"Kansas City Chiefs", "Philadelphia Eagles", "Seattle Seahawks", "Green Bay Packers"}, 2));

        // === ADDITIONAL FOOTBALL QUESTIONS ===

        // --- Legendary Players ---

        questions.add(new Question("Football",
                "Which running back was known as 'The Bus'?",
                new String[]{"Eddie George", "Jerome Bettis", "Corey Dillon", "Jamal Lewis"}, 1));

        questions.add(new Question("Football",
                "Which quarterback was known as 'Broadway Joe'?",
                new String[]{"Phil Simms", "Joe Montana", "Joe Namath", "Joe Theismann"}, 2));

        questions.add(new Question("Football",
                "Which cornerback was nicknamed 'Prime Time'?",
                new String[]{"Rod Woodson", "Charles Woodson", "Deion Sanders", "Champ Bailey"}, 2));

        questions.add(new Question("Football",
                "Which linebacker was known as 'L.T.' and revolutionized the position?",
                new String[]{"Ray Lewis", "Lawrence Taylor", "LaDainian Tomlinson", "Jack Lambert"}, 1));

        questions.add(new Question("Football",
                "Which tight end was nicknamed 'The Playmaker'?",
                new String[]{"Tony Gonzalez", "Rob Gronkowski", "Michael Irvin", "Shannon Sharpe"}, 2));

        questions.add(new Question("Football",
                "Which defensive end was known as 'Too Tall'?",
                new String[]{"Howie Long", "Ed Jones", "Deacon Jones", "Richard Dent"}, 1));

        questions.add(new Question("Football",
                "Which running back rushed for 2,066 yards in a 14-game season in 1973?",
                new String[]{"Walter Payton", "Jim Brown", "O.J. Simpson", "Earl Campbell"}, 2));

        questions.add(new Question("Football",
                "Who was the first overall pick in the 1998 NFL Draft?",
                new String[]{"Ryan Leaf", "Peyton Manning", "Charles Woodson", "Randy Moss"}, 1));

        questions.add(new Question("Football",
                "Which receiver caught the famous 'The Catch' from Joe Montana in the 1981 NFC Championship?",
                new String[]{"Jerry Rice", "John Taylor", "Freddie Solomon", "Dwight Clark"}, 3));

        questions.add(new Question("Football",
                "Which linebacker was known as 'The Nigerian Nightmare'?",
                new String[]{"Ray Lewis", "Christian Okoye", "Junior Seau", "Derrick Thomas"}, 1));

        questions.add(new Question("Football",
                "Who was the first player to rush for over 10,000 career yards?",
                new String[]{"Walter Payton", "Jim Brown", "O.J. Simpson", "Franco Harris"}, 1));

        questions.add(new Question("Football",
                "Which quarterback was known as 'Captain Comeback'?",
                new String[]{"John Elway", "Dan Marino", "Roger Staubach", "Joe Montana"}, 2));

        questions.add(new Question("Football",
                "Which receiver was known as 'The Freakʼ for his incredible athleticism?",
                new String[]{"Calvin Johnson", "Randy Moss", "Jevon Kearse", "Terrell Owens"}, 2));

        questions.add(new Question("Football",
                "Who was nicknamed 'Mean Joe' and played for the Pittsburgh Steelers?",
                new String[]{"Jack Lambert", "Jack Ham", "Joe Greene", "Mel Blount"}, 2));

        questions.add(new Question("Football",
                "Which safety was known for his hard hits and nicknamed 'The Enforcer' on the Ravens?",
                new String[]{"Ed Reed", "Rod Woodson", "Ray Lewis", "Bernard Pollard"}, 2));

        // --- Famous Plays and Moments ---

        questions.add(new Question("Football",
                "What was the 'Tuck Rule Game' between the Patriots and Raiders in 2001?",
                new String[]{"A fumble reversed to incomplete pass that helped the Patriots win", "A controversial touchdown catch", "A missed field goal call", "A roughing the passer penalty"}, 0));

        questions.add(new Question("Football",
                "Who threw the 'Miracle at the Meadowlands' fumble in 1978?",
                new String[]{"Phil Simms", "Joe Pisarcik", "Craig Morton", "Scott Brunner"}, 1));

        questions.add(new Question("Football",
                "What is the 'Minneapolis Miracle' from the 2017 NFC Divisional Playoff?",
                new String[]{"A last-second field goal", "A walk-off touchdown catch by Stefon Diggs", "A Hail Mary by Aaron Rodgers", "A pick-six to win"}, 1));

        questions.add(new Question("Football",
                "Which play is known as the 'Music City Miracle'?",
                new String[]{"A lateral kickoff return TD by the Titans in the 1999 playoffs", "A Hail Mary pass", "A blocked punt return", "A trick play by the Titans in the Super Bowl"}, 0));

        questions.add(new Question("Football",
                "Who recovered the 'Holy Roller' fumble for a touchdown in 1978?",
                new String[]{"Ken Stabler", "Dave Casper", "Fred Biletnikoff", "Cliff Branch"}, 1));

        questions.add(new Question("Football",
                "Which player's hit on Joe Theismann broke his leg on Monday Night Football in 1985?",
                new String[]{"Dexter Manley", "Harry Carson", "Lawrence Taylor", "Carl Banks"}, 2));

        questions.add(new Question("Football",
                "Who returned the opening kickoff of Super Bowl XLIV for a touchdown for the Saints?",
                new String[]{"Reggie Bush", "Tracy Porter", "Deuce McAllister", "None — the Saints recovered an onside kick"}, 3));

        questions.add(new Question("Football",
                "Who made the 'Philly Special' touchdown catch in Super Bowl LII?",
                new String[]{"Zach Ertz", "Alshon Jeffery", "Nick Foles", "Nelson Agholor"}, 2));

        questions.add(new Question("Football",
                "Which kicker missed the field goal 'Wide Right' in Super Bowl XXV?",
                new String[]{"Matt Bahr", "Scott Norwood", "Nick Lowery", "Gary Anderson"}, 1));

        questions.add(new Question("Football",
                "What was the 'Butt Fumble' involving Mark Sanchez in 2012?",
                new String[]{"A fumble caused by running into a teammate's backside on Thanksgiving", "A fumbled handoff", "A strip sack", "A muffed punt"}, 0));

        // --- Super Bowl Deep Cuts ---

        questions.add(new Question("Football",
                "Which team won Super Bowl XX in a 46-10 blowout?",
                new String[]{"San Francisco 49ers", "New York Giants", "Chicago Bears", "Washington Redskins"}, 2));

        questions.add(new Question("Football",
                "Who was the MVP of Super Bowl XX?",
                new String[]{"Walter Payton", "Jim McMahon", "Richard Dent", "Mike Singletary"}, 2));

        questions.add(new Question("Football",
                "Which team won the first Super Bowl after the AFL-NFL merger in 1970?",
                new String[]{"Dallas Cowboys", "Baltimore Colts", "Miami Dolphins", "Kansas City Chiefs"}, 1));

        questions.add(new Question("Football",
                "Who is the only wildcard team to win the Super Bowl in consecutive years?",
                new String[]{"Green Bay Packers", "New York Giants", "Pittsburgh Steelers", "No team has done this"}, 3));

        questions.add(new Question("Football",
                "Who scored the game-winning touchdown in Super Bowl XLIII with 35 seconds left?",
                new String[]{"Hines Ward", "Santonio Holmes", "Ben Roethlisberger", "James Harrison"}, 1));

        questions.add(new Question("Football",
                "Which player returned an interception 100 yards for a touchdown in Super Bowl XLIII?",
                new String[]{"Troy Polamalu", "James Harrison", "Ed Reed", "Ray Lewis"}, 1));

        questions.add(new Question("Football",
                "In Super Bowl XLIX, who threw the infamous interception at the goal line?",
                new String[]{"Tom Brady", "Russell Wilson", "Peyton Manning", "Colin Kaepernick"}, 1));

        questions.add(new Question("Football",
                "Who intercepted that pass at the goal line in Super Bowl XLIX?",
                new String[]{"Darrelle Revis", "Malcolm Butler", "Brandon Browner", "Devin McCourty"}, 1));

        questions.add(new Question("Football",
                "Which coach led the Eagles to their first Super Bowl victory in Super Bowl LII?",
                new String[]{"Andy Reid", "Chip Kelly", "Doug Pederson", "Nick Sirianni"}, 2));

        questions.add(new Question("Football",
                "Which Super Bowl is known for the 'Blackout Bowl' due to a power outage?",
                new String[]{"Super Bowl XLV", "Super Bowl XLVI", "Super Bowl XLVII", "Super Bowl XLVIII"}, 2));

        // --- Coaching Legends ---

        questions.add(new Question("Football",
                "Which coach has the most regular-season wins in NFL history?",
                new String[]{"Bill Belichick", "Don Shula", "George Halas", "Tom Landry"}, 1));

        questions.add(new Question("Football",
                "Which coach led the Steelers to four Super Bowl wins in the 1970s?",
                new String[]{"Bill Cowher", "Chuck Noll", "Don Shula", "Tom Landry"}, 1));

        questions.add(new Question("Football",
                "Who was the head coach of the 'America's Team' Dallas Cowboys for 29 years?",
                new String[]{"Jimmy Johnson", "Barry Switzer", "Bill Parcells", "Tom Landry"}, 3));

        questions.add(new Question("Football",
                "Which coach is credited with creating the West Coast Offense?",
                new String[]{"Don Coryell", "Bill Walsh", "Joe Gibbs", "Mike Holmgren"}, 1));

        questions.add(new Question("Football",
                "Who coached the Raiders to a Super Bowl win and later became a famous TV commentator?",
                new String[]{"Al Davis", "John Madden", "Tom Flores", "Art Shell"}, 1));

        questions.add(new Question("Football",
                "Which coach led three different teams (Redskins) to Super Bowl victories?",
                new String[]{"Bill Parcells", "Joe Gibbs", "Don Shula", "Mike Ditka"}, 1));

        questions.add(new Question("Football",
                "Who was the youngest head coach to win a Super Bowl at age 36?",
                new String[]{"Bill Cowher", "Jon Gruden", "Sean McVay", "Mike Tomlin"}, 2));

        // --- Draft and Combine ---

        questions.add(new Question("Football",
                "Which quarterback was famously selected 199th overall in the 2000 NFL Draft?",
                new String[]{"Drew Brees", "Tom Brady", "Kurt Warner", "Tony Romo"}, 1));

        questions.add(new Question("Football",
                "Who was the first overall pick in the 1989 NFL Draft by the Dallas Cowboys?",
                new String[]{"Troy Aikman", "Barry Sanders", "Deion Sanders", "Derrick Thomas"}, 0));

        questions.add(new Question("Football",
                "What is the 40-yard dash at the NFL Combine used to measure?",
                new String[]{"Endurance", "Straight-line speed", "Agility", "Vertical leap"}, 1));

        questions.add(new Question("Football",
                "Which player ran the fastest official 40-yard dash at the NFL Combine with a 4.22?",
                new String[]{"Tyreek Hill", "John Ross", "Chris Johnson", "Deion Sanders"}, 1));

        questions.add(new Question("Football",
                "Which running back was selected 5th overall in the 2005 draft but chose to sit out rather than play for the Chargers?",
                new String[]{"Reggie Bush", "Eli Manning", "Bo Jackson", "John Elway"}, 2));

        questions.add(new Question("Football",
                "Who was the number 1 overall pick in the 1983 NFL Draft?",
                new String[]{"Dan Marino", "Jim Kelly", "John Elway", "Todd Blackledge"}, 2));

        // --- Rules, Penalties, and Strategy ---

        questions.add(new Question("Football",
                "How many timeouts does each team get per half?",
                new String[]{"2", "3", "4", "5"}, 1));

        questions.add(new Question("Football",
                "How long is an NFL quarter?",
                new String[]{"12 minutes", "15 minutes", "20 minutes", "10 minutes"}, 1));

        questions.add(new Question("Football",
                "What is a 'touchback' in football?",
                new String[]{"A safety", "A ball downed in the end zone on a kick, placed at the 25-yard line", "A fumble recovery", "A blocked punt"}, 1));

        questions.add(new Question("Football",
                "What is 'roughing the passer'?",
                new String[]{"Hitting the QB after releasing the ball", "A late hit on any player", "Tackling by the face mask", "Unnecessary roughness"}, 0));

        questions.add(new Question("Football",
                "What is a 'play-action' pass?",
                new String[]{"A screen pass", "A fake handoff followed by a pass", "A quarterback scramble", "A trick play with a lateral"}, 1));

        questions.add(new Question("Football",
                "How many yards is the penalty for pass interference in the NFL?",
                new String[]{"10 yards", "15 yards", "Spot of the foul", "Half the distance to the goal"}, 2));

        questions.add(new Question("Football",
                "What is a 'two-minute warning' in the NFL?",
                new String[]{"A timeout called by either team", "An automatic stoppage when 2 minutes remain in each half", "A warning to the losing team", "A coaching challenge opportunity"}, 1));

        questions.add(new Question("Football",
                "What is a 'nickel defense'?",
                new String[]{"A defense with 5 defensive backs", "A defense with 5 linemen", "A blitz package", "A prevent defense"}, 0));

        questions.add(new Question("Football",
                "What is a 'dime defense'?",
                new String[]{"A defense with 5 defensive backs", "A defense with 6 defensive backs", "A goal-line defense", "A 3-4 defense"}, 1));

        questions.add(new Question("Football",
                "What is a 'read-option' in football?",
                new String[]{"A passing concept", "A play where the QB reads a defender to decide whether to hand off or keep", "A defensive scheme", "A punt formation"}, 1));

        questions.add(new Question("Football",
                "What is the 'red zone' in football?",
                new String[]{"The area inside the opponent's 20-yard line", "The end zone", "The area between the 40-yard lines", "The sideline area"}, 0));

        questions.add(new Question("Football",
                "What does 'RPO' stand for in modern football offenses?",
                new String[]{"Run-Pass Option", "Read-Play Offense", "Rushing Percentage Outcome", "Receiver Post Option"}, 0));

        questions.add(new Question("Football",
                "What is a 'West Coast Offense' known for?",
                new String[]{"Deep passing and vertical routes", "Short, precise passes used to control the ball", "Heavy run game with play-action", "Shotgun formation exclusively"}, 1));

        // --- Team Facts and Rivalries ---

        questions.add(new Question("Football",
                "Which is the oldest rivalry in the NFL?",
                new String[]{"Cowboys vs. Eagles", "Packers vs. Bears", "Steelers vs. Ravens", "49ers vs. Rams"}, 1));

        questions.add(new Question("Football",
                "Which team relocated from Baltimore to Indianapolis in 1984?",
                new String[]{"Ravens", "Colts", "Stallions", "Orioles"}, 1));

        questions.add(new Question("Football",
                "Which team was the last NFL franchise to go 0-16 in a season?",
                new String[]{"Cleveland Browns", "Detroit Lions", "Houston Texans", "Jacksonville Jaguars"}, 0));

        questions.add(new Question("Football",
                "What year did the Houston Texans begin play as an expansion team?",
                new String[]{"1999", "2000", "2002", "2004"}, 2));

        questions.add(new Question("Football",
                "Which team's defensive unit was known as the 'Purple People Eaters'?",
                new String[]{"Baltimore Ravens", "Minnesota Vikings", "New York Giants", "Chicago Bears"}, 1));

        questions.add(new Question("Football",
                "Which team's defense in the 1985 season was known as one of the greatest ever?",
                new String[]{"Pittsburgh Steelers", "New York Giants", "Chicago Bears", "San Francisco 49ers"}, 2));

        questions.add(new Question("Football",
                "Which team's defensive unit was known as the 'Steel Curtain'?",
                new String[]{"Cleveland Browns", "Baltimore Ravens", "Pittsburgh Steelers", "Chicago Bears"}, 2));

        questions.add(new Question("Football",
                "Which team's defense was called the 'Doomsday Defense'?",
                new String[]{"Dallas Cowboys", "Pittsburgh Steelers", "Chicago Bears", "Minnesota Vikings"}, 0));

        questions.add(new Question("Football",
                "Which team's defense was known as the 'No-Name Defense'?",
                new String[]{"1972 Miami Dolphins", "1985 Chicago Bears", "2000 Baltimore Ravens", "2013 Seattle Seahawks"}, 0));

        questions.add(new Question("Football",
                "Which team's defense was called the 'Legion of Boom'?",
                new String[]{"Baltimore Ravens", "Denver Broncos", "Seattle Seahawks", "New England Patriots"}, 2));

        questions.add(new Question("Football",
                "The 'Terrible Towel' is associated with which NFL franchise?",
                new String[]{"Cleveland Browns", "Pittsburgh Steelers", "Green Bay Packers", "Kansas City Chiefs"}, 1));

        questions.add(new Question("Football",
                "Which team plays its home games at Lambeau Field?",
                new String[]{"Chicago Bears", "Minnesota Vikings", "Green Bay Packers", "Detroit Lions"}, 2));

        questions.add(new Question("Football",
                "What is the name of the Dallas Cowboys' home stadium?",
                new String[]{"MetLife Stadium", "AT&T Stadium", "NRG Stadium", "Jerry World"}, 1));

        // --- Thanksgiving and Monday Night Football ---

        questions.add(new Question("Football",
                "Which team has hosted a Thanksgiving Day game every year since 1934?",
                new String[]{"Dallas Cowboys", "Detroit Lions", "Green Bay Packers", "Chicago Bears"}, 1));

        questions.add(new Question("Football",
                "In what year did Monday Night Football first air?",
                new String[]{"1968", "1970", "1972", "1975"}, 1));

        questions.add(new Question("Football",
                "Who was the longest-tenured commentator on Monday Night Football?",
                new String[]{"Howard Cosell", "Frank Gifford", "Al Michaels", "Dan Dierdorf"}, 1));

        questions.add(new Question("Football",
                "Which running back ran for 273 yards on Thanksgiving Day in 1998?",
                new String[]{"Emmitt Smith", "Eddie George", "Barry Sanders", "Terrell Davis"}, 2));

        // --- Miscellaneous Football Knowledge ---

        questions.add(new Question("Football",
                "What is a 'franchise tag' in the NFL?",
                new String[]{"A way to permanently sign a player", "A one-year designation that prevents a player from becoming a free agent", "A trade restriction", "A draft pick compensation"}, 1));

        questions.add(new Question("Football",
                "What is the NFL salary cap?",
                new String[]{"A limit on individual player salaries", "A maximum total amount teams can spend on player salaries", "A tax on high-earning players", "A bonus pool for winning teams"}, 1));

        questions.add(new Question("Football",
                "What is 'OTA' in the NFL offseason?",
                new String[]{"Official Team Assessment", "Organized Team Activities", "Optional Training Academy", "Off-season Tactical Analysis"}, 1));

        questions.add(new Question("Football",
                "What is the 'NFL Combine'?",
                new String[]{"The league's annual meeting", "A pre-draft event where prospects perform physical and mental tests", "A coaching clinic", "The Pro Bowl skills competition"}, 1));

        questions.add(new Question("Football",
                "What does 'IR' stand for in the NFL?",
                new String[]{"Inactive Reserve", "Injured Reserve", "Internal Review", "Interim Roster"}, 1));

        questions.add(new Question("Football",
                "What is the 'practice squad' in the NFL?",
                new String[]{"The starting lineup in practice", "A group of players signed to a team but not on the active roster for games", "A team's coaching staff", "A scouting team"}, 1));

        questions.add(new Question("Football",
                "How many divisions are in each NFL conference?",
                new String[]{"3", "4", "5", "6"}, 1));

        questions.add(new Question("Football",
                "How many teams make the NFL playoffs?",
                new String[]{"12", "14", "16", "10"}, 1));

        questions.add(new Question("Football",
                "What is a 'pocket' in football?",
                new String[]{"The area behind the offensive line where the QB stands to pass", "The end zone", "The sideline area", "A defensive formation"}, 0));

        questions.add(new Question("Football",
                "Who coined the term 'Super Bowl'?",
                new String[]{"Pete Rozelle", "Vince Lombardi", "Lamar Hunt", "Al Davis"}, 2));

        questions.add(new Question("Football",
                "What was the name of the NFL's developmental spring league that launched in 2020?",
                new String[]{"NFL Europe", "XFL", "USFL", "Alliance of American Football"}, 1));

        questions.add(new Question("Football",
                "Which running back was known as 'Beast Mode'?",
                new String[]{"Adrian Peterson", "Marshawn Lynch", "Le'Veon Bell", "Todd Gurley"}, 1));

        questions.add(new Question("Football",
                "Which quarterback was known as 'The Gunslinger'?",
                new String[]{"John Elway", "Dan Marino", "Brett Favre", "Terry Bradshaw"}, 2));

        questions.add(new Question("Football",
                "Which safety was known for his ballhawking ability and played for the Ravens?",
                new String[]{"Troy Polamalu", "Brian Dawkins", "Ed Reed", "Sean Taylor"}, 2));

        questions.add(new Question("Football",
                "What is the 'Discount Double Check' celebration associated with?",
                new String[]{"Tom Brady", "Peyton Manning", "Aaron Rodgers", "Drew Brees"}, 2));

        // === STATISTICS-BASED FOOTBALL QUESTIONS ===

        // --- Passing Stats ---

        questions.add(new Question("Football",
                "How many career passing yards did Drew Brees accumulate?",
                new String[]{"71,940", "76,559", "80,358", "89,214"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Peyton Manning throw?",
                new String[]{"471", "508", "539", "571"}, 2));

        questions.add(new Question("Football",
                "What was Aaron Rodgers' career regular-season passer rating?",
                new String[]{"96.4", "100.5", "103.1", "104.5"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Dan Marino accumulate?",
                new String[]{"51,636", "55,410", "61,361", "65,000"}, 2));

        questions.add(new Question("Football",
                "How many passing touchdowns did Dan Marino throw in his record-breaking 1984 season?",
                new String[]{"40", "44", "48", "52"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Brett Favre throw for?",
                new String[]{"61,655", "66,000", "71,838", "75,000"}, 2));

        questions.add(new Question("Football",
                "What is the highest single-game passer rating in NFL history?",
                new String[]{"It's the maximum possible passer rating", "It was set by Peyton Manning", "It was set by Tom Brady", "No one has achieved it"}, 0));

        questions.add(new Question("Football",
                "How many career game-winning drives did Tom Brady lead — the all-time record?",
                new String[]{"41", "48", "55", "63"}, 2));

        questions.add(new Question("Football",
                "What was Peyton Manning's single-season passing yards record (5,477) set in which year?",
                new String[]{"2004", "2009", "2013", "2015"}, 2));

        questions.add(new Question("Football",
                "How many 4,000-yard passing seasons did Drew Brees have?",
                new String[]{"8", "10", "12", "14"}, 2));

        questions.add(new Question("Football",
                "How many consecutive games did Tom Brady throw at least one touchdown pass?",
                new String[]{"36", "44", "52", "60"}, 2));

        questions.add(new Question("Football",
                "How many career fourth-quarter comebacks did Peyton Manning lead?",
                new String[]{"33", "38", "43", "50"}, 2));

        questions.add(new Question("Football",
                "What was Patrick Mahomes' passing yards total in his 2018 MVP season?",
                new String[]{"4,500", "4,812", "5,097", "5,300"}, 2));

        questions.add(new Question("Football",
                "How many passing touchdowns did Patrick Mahomes throw in his 2018 MVP season?",
                new String[]{"40", "45", "50", "55"}, 2));

        questions.add(new Question("Football",
                "What is the NFL record for most passing yards in a single game?",
                new String[]{"Norm Van Brocklin", "Drew Brees", "Matt Ryan", "Tom Brady"}, 0));

        questions.add(new Question("Football",
                "How many career completions does Tom Brady hold the record with?",
                new String[]{"6,778", "7,263", "7,500", "7,900"}, 1));

        questions.add(new Question("Football",
                "How many seasons did Drew Brees lead the NFL in passing yards?",
                new String[]{"5", "7", "9", "11"}, 1));

        questions.add(new Question("Football",
                "What is the highest single-season completion percentage in NFL history?",
                new String[]{"Tom Brady", "Tua Tagovailoa", "Drew Brees", "Aaron Rodgers"}, 1));

        questions.add(new Question("Football",
                "How many career 300-yard passing games did Drew Brees have?",
                new String[]{"97", "108", "123", "135"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Tom Brady throw?",
                new String[]{"145", "175", "203", "230"}, 2));

        // --- Rushing Stats ---

        questions.add(new Question("Football",
                "How many career rushing yards did Walter Payton accumulate?",
                new String[]{"15,269", "16,726", "17,500", "18,355"}, 1));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Walter Payton score?",
                new String[]{"100", "110", "125", "135"}, 1));

        questions.add(new Question("Football",
                "How many career rushing yards did Barry Sanders accumulate in only 10 seasons?",
                new String[]{"13,778", "15,269", "16,500", "18,355"}, 1));

        questions.add(new Question("Football",
                "What was Barry Sanders' rushing yards total in his 1997 season when he nearly hit 2,100?",
                new String[]{"1,950", "2,000", "2,053", "2,105"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Frank Gore accumulate?",
                new String[]{"14,026", "15,269", "16,000", "16,726"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Jim Brown accumulate in only 9 seasons?",
                new String[]{"10,009", "11,500", "12,312", "13,000"}, 2));

        questions.add(new Question("Football",
                "What was Jim Brown's career rushing average per carry?",
                new String[]{"4.5", "4.8", "5.2", "5.6"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did Adrian Peterson gain in his 2012 MVP season?",
                new String[]{"1,898", "1,958", "2,027", "2,097"}, 3));

        questions.add(new Question("Football",
                "How many career 1,000-yard rushing seasons did Emmitt Smith have?",
                new String[]{"9", "11", "13", "15"}, 1));

        questions.add(new Question("Football",
                "What is the NFL record for most rushing yards in a single game?",
                new String[]{"Adrian Peterson", "Jamal Lewis", "Barry Sanders", "Corey Dillon"}, 0));

        questions.add(new Question("Football",
                "How many rushing touchdowns did Shaun Alexander score in 2005?",
                new String[]{"22", "25", "27", "28"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Marshawn Lynch accumulate?",
                new String[]{"8,500", "9,112", "10,413", "11,200"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did LaDainian Tomlinson accumulate?",
                new String[]{"11,500", "12,490", "13,684", "14,500"}, 2));

        questions.add(new Question("Football",
                "How many total touchdowns did LaDainian Tomlinson score in his 2006 record season?",
                new String[]{"25", "28", "31", "33"}, 2));

        questions.add(new Question("Football",
                "What was Derrick Henry's rushing total in his 2020 season?",
                new String[]{"1,540", "1,734", "2,027", "2,105"}, 2));

        // --- Receiving Stats ---

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Jerry Rice score?",
                new String[]{"156", "172", "187", "197"}, 3));

        questions.add(new Question("Football",
                "How many career receptions did Larry Fitzgerald accumulate?",
                new String[]{"1,200", "1,325", "1,432", "1,549"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Terrell Owens accumulate?",
                new String[]{"13,899", "14,934", "15,934", "16,500"}, 2));

        questions.add(new Question("Football",
                "How many 1,000-yard receiving seasons did Jerry Rice have?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Randy Moss accumulate?",
                new String[]{"14,000", "14,585", "15,292", "16,000"}, 2));

        questions.add(new Question("Football",
                "How many receiving touchdowns did Randy Moss catch in his record 2007 season with the Patriots?",
                new String[]{"18", "20", "23", "25"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Tony Gonzalez make?",
                new String[]{"1,100", "1,200", "1,325", "1,400"}, 2));

        questions.add(new Question("Football",
                "What is the NFL record for most receiving yards in a single game?",
                new String[]{"Calvin Johnson", "Julio Jones", "Flipper Anderson", "Jerry Rice"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Antonio Gates score?",
                new String[]{"96", "106", "116", "126"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Wes Welker make with the Patriots?",
                new String[]{"500", "600", "672", "750"}, 2));

        // --- Defensive Stats ---

        questions.add(new Question("Football",
                "How many career sacks did Reggie White accumulate?",
                new String[]{"160.0", "172.0", "186.0", "198.0"}, 3));

        questions.add(new Question("Football",
                "How many career sacks did Kevin Greene record?",
                new String[]{"150.0", "160.0", "175.0", "190.5"}, 1));

        questions.add(new Question("Football",
                "How many career interceptions did Rod Woodson record?",
                new String[]{"61", "67", "71", "81"}, 2));

        questions.add(new Question("Football",
                "How many career interception return touchdowns did Rod Woodson score?",
                new String[]{"8", "10", "12", "14"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Julius Peppers record?",
                new String[]{"140.0", "149.0", "159.5", "170.0"}, 2));

        questions.add(new Question("Football",
                "How many career tackles did Ray Lewis accumulate?",
                new String[]{"1,568", "1,798", "2,059", "2,200"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Charles Woodson record?",
                new String[]{"55", "60", "65", "71"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Michael Strahan record?",
                new String[]{"131.5", "141.5", "151.5", "161.5"}, 1));

        questions.add(new Question("Football",
                "How many career interceptions did Ed Reed return for touchdowns?",
                new String[]{"5", "6", "7", "8"}, 2));

        questions.add(new Question("Football",
                "What is the longest interception return in NFL history?",
                new String[]{"Deion Sanders", "Ed Reed", "Rod Woodson", "Charles Woodson"}, 1));

        // --- Special Teams Stats ---

        questions.add(new Question("Football",
                "How many career kick return touchdowns did Devin Hester score?",
                new String[]{"14", "17", "20", "23"}, 2));

        questions.add(new Question("Football",
                "How many career field goals did Adam Vinatieri make?",
                new String[]{"499", "529", "582", "620"}, 2));

        questions.add(new Question("Football",
                "What is the NFL record for longest punt?",
                new String[]{"Shane Lechler", "Steve O'Neal", "Ray Guy", "Thomas Morstead"}, 1));

        questions.add(new Question("Football",
                "How many career punt return touchdowns did Devin Hester score?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "What is the highest single-season field goal percentage in NFL history?",
                new String[]{"Adam Vinatieri", "Justin Tucker", "Harrison Butker", "Stephen Gostkowski"}, 1));

        // --- Postseason and Super Bowl Stats ---

        questions.add(new Question("Football",
                "How many career postseason passing touchdowns did Tom Brady throw?",
                new String[]{"60", "73", "83", "90"}, 2));

        questions.add(new Question("Football",
                "How many career postseason wins did Tom Brady accumulate?",
                new String[]{"25", "30", "35", "40"}, 2));

        questions.add(new Question("Football",
                "What is the most passing yards in a single Super Bowl?",
                new String[]{"467", "480", "505", "520"}, 2));

        questions.add(new Question("Football",
                "How many total points were scored in the highest-scoring Super Bowl?",
                new String[]{"65", "69", "75", "80"}, 2));

        questions.add(new Question("Football",
                "How many career postseason rushing yards did Emmitt Smith accumulate?",
                new String[]{"1,200", "1,400", "1,586", "1,800"}, 2));

        questions.add(new Question("Football",
                "How many career postseason touchdowns did Jerry Rice score?",
                new String[]{"18", "22", "26", "30"}, 1));

        questions.add(new Question("Football",
                "What is the most rushing yards in a single Super Bowl game?",
                new String[]{"175", "191", "204", "215"}, 2));

        questions.add(new Question("Football",
                "How many career postseason interceptions did Ronnie Lott record?",
                new String[]{"6", "8", "9", "11"}, 2));

        questions.add(new Question("Football",
                "How many touchdowns did the 2007 Patriots score in the regular season?",
                new String[]{"62", "68", "75", "80"}, 2));

        questions.add(new Question("Football",
                "What is the fewest points allowed by a defense in a 16-game season?",
                new String[]{"145", "155", "165", "175"}, 2));

        // --- Team and Season Stats ---

        questions.add(new Question("Football",
                "What is the most total yards gained by a team in a single NFL season?",
                new String[]{"6,800", "7,100", "7,474", "7,800"}, 2));

        questions.add(new Question("Football",
                "How many total points did the 2013 Broncos score — an NFL record?",
                new String[]{"540", "560", "589", "606"}, 3));

        questions.add(new Question("Football",
                "What is the most sacks recorded by a team in a single season?",
                new String[]{"60", "66", "72", "78"}, 2));

        questions.add(new Question("Football",
                "How many consecutive wins did the 2003-2004 Patriots achieve?",
                new String[]{"17", "19", "21", "23"}, 2));

        questions.add(new Question("Football",
                "What is the longest regular-season winning streak in NFL history?",
                new String[]{"19", "21", "23", "25"}, 2));

        questions.add(new Question("Football",
                "How many points did the 2000 Ravens defense allow per game on average?",
                new String[]{"8.4", "10.3", "12.6", "14.1"}, 1));

        questions.add(new Question("Football",
                "How many rushing yards did the 1978 Patriots gain as a team — an NFL single-game record?",
                new String[]{"2,800", "2,950", "3,165", "3,300"}, 2));

        questions.add(new Question("Football",
                "What was the 1972 Dolphins' point differential for the season?",
                new String[]{"+126", "+152", "+171", "+189"}, 2));

        questions.add(new Question("Football",
                "How many career wins does Tom Brady hold the record for among QBs?",
                new String[]{"220", "235", "251", "265"}, 2));

        questions.add(new Question("Football",
                "How many career Pro Bowl selections did Merlin Olsen and Bruce Matthews each earn?",
                new String[]{"11", "12", "13", "14"}, 3));

        // === 300 MORE FOOTBALL QUESTIONS ===

        // --- Passing Stats Deep Dive ---

        questions.add(new Question("Football",
                "How many career passing yards did John Elway accumulate?",
                new String[]{"45,000", "48,000", "51,475", "55,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did John Elway throw?",
                new String[]{"260", "280", "300", "320"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Philip Rivers accumulate?",
                new String[]{"55,000", "59,000", "63,440", "67,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Philip Rivers throw?",
                new String[]{"370", "395", "421", "445"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Ben Roethlisberger accumulate?",
                new String[]{"56,000", "60,000", "64,088", "68,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Ben Roethlisberger throw?",
                new String[]{"370", "395", "418", "445"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Eli Manning accumulate?",
                new String[]{"50,000", "53,000", "57,023", "60,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Eli Manning throw?",
                new String[]{"320", "345", "366", "390"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Matt Ryan accumulate?",
                new String[]{"55,000", "59,000", "62,792", "66,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Matt Ryan throw?",
                new String[]{"340", "360", "381", "400"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Russell Wilson accumulate through 2024?",
                new String[]{"38,000", "41,000", "43,653", "47,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Aaron Rodgers throw through 2024?",
                new String[]{"430", "455", "475", "500"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Aaron Rodgers accumulate through 2024?",
                new String[]{"52,000", "56,000", "59,055", "63,000"}, 2));

        questions.add(new Question("Football",
                "How many career 4th-quarter comebacks did John Elway lead?",
                new String[]{"28", "34", "40", "46"}, 2));

        questions.add(new Question("Football",
                "How many career game-winning drives did Dan Marino lead?",
                new String[]{"26", "31", "36", "41"}, 2));

        questions.add(new Question("Football",
                "What was Kurt Warner's career passer rating?",
                new String[]{"88.2", "91.0", "93.7", "96.5"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Fran Tarkenton accumulate?",
                new String[]{"40,000", "43,500", "47,003", "50,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Fran Tarkenton throw?",
                new String[]{"290", "315", "342", "370"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Warren Moon accumulate in the NFL?",
                new String[]{"42,000", "45,500", "49,325", "52,000"}, 2));

        questions.add(new Question("Football",
                "How many consecutive starts did Brett Favre make — the NFL record?",
                new String[]{"250", "275", "297", "320"}, 2));

        // --- Rushing Stats Deep Dive ---

        questions.add(new Question("Football",
                "How many career rushing yards did Curtis Martin accumulate?",
                new String[]{"12,000", "13,000", "14,101", "15,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Marcus Allen accumulate?",
                new String[]{"10,500", "11,300", "12,243", "13,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Jerome Bettis accumulate?",
                new String[]{"11,500", "12,500", "13,662", "14,500"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Marcus Allen score?",
                new String[]{"100", "110", "123", "135"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Tony Dorsett accumulate?",
                new String[]{"10,800", "11,700", "12,739", "13,500"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Eric Dickerson accumulate?",
                new String[]{"11,500", "12,400", "13,259", "14,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Thurman Thomas accumulate?",
                new String[]{"10,500", "11,200", "12,074", "13,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Jim Brown score?",
                new String[]{"86", "96", "106", "116"}, 2));

        questions.add(new Question("Football",
                "What was Jim Brown's career total rushing yards per season average?",
                new String[]{"1,100", "1,250", "1,368", "1,500"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Edgerrin James accumulate?",
                new String[]{"10,500", "11,400", "12,246", "13,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Adrian Peterson score?",
                new String[]{"100", "110", "120", "130"}, 2));

        questions.add(new Question("Football",
                "How many career 1,000-yard rushing seasons did Barry Sanders have?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Terrell Davis score?",
                new String[]{"45", "53", "60", "70"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did Terrell Davis gain in the 1998 season?",
                new String[]{"1,850", "1,950", "2,008", "2,100"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Derrick Henry accumulate through 2024?",
                new String[]{"8,500", "9,500", "10,413", "11,500"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Fred Taylor accumulate?",
                new String[]{"9,800", "10,700", "11,695", "12,500"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Corey Dillon accumulate?",
                new String[]{"9,500", "10,400", "11,241", "12,000"}, 2));

        questions.add(new Question("Football",
                "What is the record for most rushing yards by a quarterback in a season?",
                new String[]{"1,000", "1,100", "1,206", "1,300"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Michael Vick accumulate?",
                new String[]{"4,800", "5,500", "6,109", "7,000"}, 2));

        questions.add(new Question("Football",
                "How many rushing touchdowns did Priest Holmes score in 2003?",
                new String[]{"22", "25", "27", "30"}, 2));

        // --- Receiving Stats Deep Dive ---

        questions.add(new Question("Football",
                "How many career receiving yards did Tim Brown accumulate?",
                new String[]{"12,500", "13,700", "14,934", "16,000"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Terrell Owens score?",
                new String[]{"130", "140", "153", "165"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Marvin Harrison accumulate?",
                new String[]{"950", "1,025", "1,102", "1,200"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Marvin Harrison score?",
                new String[]{"105", "115", "128", "140"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Steve Largent accumulate?",
                new String[]{"11,000", "12,000", "13,089", "14,000"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Andre Johnson accumulate?",
                new String[]{"12,000", "13,000", "14,185", "15,000"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Don Hutson score?",
                new String[]{"75", "85", "99", "110"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Shannon Sharpe accumulate?",
                new String[]{"700", "760", "815", "870"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Isaac Bruce accumulate?",
                new String[]{"13,000", "14,000", "15,208", "16,000"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Cris Carter score?",
                new String[]{"110", "120", "130", "140"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Cris Carter accumulate?",
                new String[]{"950", "1,025", "1,101", "1,200"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Henry Ellard accumulate?",
                new String[]{"11,500", "12,500", "13,777", "15,000"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Reggie Wayne accumulate?",
                new String[]{"12,000", "13,200", "14,345", "15,500"}, 2));

        questions.add(new Question("Football",
                "How many career receptions did Jason Witten accumulate?",
                new String[]{"1,050", "1,140", "1,228", "1,320"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Rob Gronkowski score?",
                new String[]{"72", "82", "92", "102"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Julio Jones accumulate?",
                new String[]{"11,500", "12,400", "13,330", "14,200"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did DeAndre Hopkins accumulate through 2024?",
                new String[]{"10,500", "11,500", "12,509", "13,500"}, 2));

        questions.add(new Question("Football",
                "How many receiving yards did Calvin Johnson gain in his record 2012 season?",
                new String[]{"1,750", "1,850", "1,964", "2,050"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Travis Kelce score through 2024?",
                new String[]{"60", "68", "76", "85"}, 2));

        questions.add(new Question("Football",
                "How many receptions did Michael Thomas make in his record 2019 season?",
                new String[]{"130", "140", "149", "155"}, 2));

        // --- Defensive Stats Deep Dive ---

        questions.add(new Question("Football",
                "How many career sacks did Derrick Thomas accumulate?",
                new String[]{"105", "115", "126.5", "140"}, 2));

        questions.add(new Question("Football",
                "How many sacks did Derrick Thomas record in a single game — the NFL record?",
                new String[]{"5", "6", "7", "8"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Chris Doleman accumulate?",
                new String[]{"130", "140", "150.5", "160"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did John Randle accumulate?",
                new String[]{"115", "125", "137.5", "150"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Richard Dent accumulate?",
                new String[]{"115", "125", "137.5", "150"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Jason Taylor accumulate?",
                new String[]{"120", "130", "139.5", "150"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Jared Allen accumulate?",
                new String[]{"115", "125", "136", "145"}, 2));

        questions.add(new Question("Football",
                "How many sacks did Jared Allen record in 2011?",
                new String[]{"18", "20", "22", "24"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did DeMarcus Ware accumulate?",
                new String[]{"118", "128", "138.5", "148"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Dwight Freeney accumulate?",
                new String[]{"105", "115", "125.5", "135"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Terrell Suggs accumulate?",
                new String[]{"119", "129", "139", "149"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Von Miller accumulate through 2024?",
                new String[]{"105", "115", "123.5", "135"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Darren Sharper record?",
                new String[]{"48", "55", "63", "71"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Ty Law record?",
                new String[]{"40", "47", "53", "60"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Champ Bailey record?",
                new String[]{"39", "46", "52", "58"}, 2));

        questions.add(new Question("Football",
                "How many career tackles did London Fletcher accumulate?",
                new String[]{"1,750", "1,900", "2,039", "2,200"}, 2));

        questions.add(new Question("Football",
                "How many consecutive games did London Fletcher play?",
                new String[]{"210", "230", "256", "280"}, 2));

        questions.add(new Question("Football",
                "How many career tackles did Junior Seau accumulate?",
                new String[]{"1,550", "1,700", "1,849", "2,000"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Lawrence Taylor accumulate?",
                new String[]{"120", "130", "142", "155"}, 2));

        questions.add(new Question("Football",
                "How many sacks did Lawrence Taylor record in his 1986 MVP season?",
                new String[]{"16.5", "18.5", "20.5", "22.5"}, 2));

        // --- Kicking and Special Teams Deep Dive ---

        questions.add(new Question("Football",
                "How many career field goals did Morten Andersen make?",
                new String[]{"500", "530", "565", "600"}, 2));

        questions.add(new Question("Football",
                "How many career points did Morten Andersen score?",
                new String[]{"2,200", "2,400", "2,544", "2,700"}, 2));

        questions.add(new Question("Football",
                "What is Justin Tucker's career field goal percentage through 2024?",
                new String[]{"86.5%", "88.2%", "89.9%", "91.5%"}, 2));

        questions.add(new Question("Football",
                "How many career points did Jason Elam score?",
                new String[]{"1,700", "1,850", "1,983", "2,100"}, 2));

        questions.add(new Question("Football",
                "How many career kickoff return touchdowns did Josh Cribbs score?",
                new String[]{"5", "6", "8", "10"}, 2));

        questions.add(new Question("Football",
                "How many career punt return touchdowns did Deion Sanders score?",
                new String[]{"4", "5", "6", "7"}, 2));

        questions.add(new Question("Football",
                "What is the longest kickoff return in NFL history?",
                new String[]{"105", "107", "109", "111"}, 2));

        questions.add(new Question("Football",
                "How many career field goals did Gary Anderson make?",
                new String[]{"480", "510", "538", "560"}, 2));

        questions.add(new Question("Football",
                "In 1998 Gary Anderson went a perfect season without missing a FG. How many did he make?",
                new String[]{"28", "32", "35", "38"}, 2));

        questions.add(new Question("Football",
                "How many career points did Stephen Gostkowski score?",
                new String[]{"1,500", "1,650", "1,775", "1,900"}, 2));

        // --- Quarterback Season Stats ---

        questions.add(new Question("Football",
                "How many passing touchdowns did Tom Brady throw in his 2007 season?",
                new String[]{"45", "48", "50", "52"}, 2));

        questions.add(new Question("Football",
                "How many passing yards did Drew Brees throw for in 2011?",
                new String[]{"5,100", "5,250", "5,476", "5,600"}, 2));

        questions.add(new Question("Football",
                "What was Aaron Rodgers' passer rating in his 2011 MVP season?",
                new String[]{"112.5", "117.5", "122.5", "127.5"}, 2));

        questions.add(new Question("Football",
                "How many interceptions did Aaron Rodgers throw in his 2018 season?",
                new String[]{"1", "2", "3", "4"}, 1));

        questions.add(new Question("Football",
                "How many passing yards did Matthew Stafford throw for in 2011?",
                new String[]{"4,700", "4,850", "5,038", "5,200"}, 2));

        questions.add(new Question("Football",
                "How many passing touchdowns did Kurt Warner throw in the 1999 season?",
                new String[]{"35", "38", "41", "44"}, 2));

        questions.add(new Question("Football",
                "What was Joe Montana's career passer rating?",
                new String[]{"86.5", "89.4", "92.3", "95.0"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Troy Aikman accumulate?",
                new String[]{"28,000", "30,500", "32,942", "35,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Joe Montana throw?",
                new String[]{"240", "255", "273", "290"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Joe Montana accumulate?",
                new String[]{"35,000", "38,000", "40,551", "43,000"}, 2));

        // --- Rushing Season Stats ---

        questions.add(new Question("Football",
                "How many rushing yards did Jamal Lewis gain in 2003?",
                new String[]{"1,900", "2,000", "2,066", "2,105"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did Chris Johnson gain in 2009?",
                new String[]{"1,850", "1,950", "2,006", "2,100"}, 2));

        questions.add(new Question("Football",
                "How many rushing touchdowns did Earl Campbell score in 1979?",
                new String[]{"15", "17", "19", "21"}, 2));

        questions.add(new Question("Football",
                "How many consecutive 100-yard rushing games did Barry Sanders have in 1997?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did O.J. Simpson gain in a single game in 1976?",
                new String[]{"250", "260", "273", "285"}, 2));

        questions.add(new Question("Football",
                "How many rushing touchdowns did Clinton Portis score in 2003?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Jerome Bettis score?",
                new String[]{"75", "83", "91", "100"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did Earl Campbell gain in 1980?",
                new String[]{"1,700", "1,800", "1,934", "2,050"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did Emmitt Smith gain in 1995?",
                new String[]{"1,600", "1,700", "1,773", "1,900"}, 2));

        questions.add(new Question("Football",
                "How many career fumbles did Warren Moon commit — the all-time record?",
                new String[]{"120", "140", "161", "180"}, 2));

        // --- Touchdown and Scoring Stats ---

        questions.add(new Question("Football",
                "How many career touchdowns did Marcus Allen score?",
                new String[]{"120", "130", "145", "160"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Marshall Faulk score?",
                new String[]{"115", "125", "136", "150"}, 2));

        questions.add(new Question("Football",
                "How many total touchdowns did Marshall Faulk score in 2000?",
                new String[]{"20", "23", "26", "29"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Terrell Davis score?",
                new String[]{"50", "58", "65", "75"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Adrian Peterson score?",
                new String[]{"100", "110", "120", "130"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Shaun Alexander score?",
                new String[]{"90", "100", "112", "125"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Curtis Martin score?",
                new String[]{"80", "90", "100", "110"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Barry Sanders score?",
                new String[]{"90", "100", "109", "120"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Walter Payton score?",
                new String[]{"105", "115", "125", "135"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Frank Gore score?",
                new String[]{"65", "73", "81", "90"}, 2));

        // --- Postseason and Super Bowl Deep Stats ---

        questions.add(new Question("Football",
                "How many career postseason passing yards did Tom Brady accumulate?",
                new String[]{"10,500", "12,000", "13,400", "15,000"}, 2));

        questions.add(new Question("Football",
                "How many career postseason rushing yards did Franco Harris accumulate?",
                new String[]{"1,200", "1,400", "1,556", "1,700"}, 2));

        questions.add(new Question("Football",
                "How many career postseason receiving yards did Jerry Rice accumulate?",
                new String[]{"1,800", "2,050", "2,245", "2,500"}, 2));

        questions.add(new Question("Football",
                "What was Joe Montana's career postseason passer rating?",
                new String[]{"89.0", "92.5", "95.6", "98.0"}, 2));

        questions.add(new Question("Football",
                "How many career postseason touchdown passes did Joe Montana throw?",
                new String[]{"35", "40", "45", "50"}, 2));

        questions.add(new Question("Football",
                "How many career postseason games did Tom Brady start?",
                new String[]{"35", "42", "48", "55"}, 2));

        questions.add(new Question("Football",
                "How many points did the Patriots score in Super Bowl LI after trailing 28-3 to win?",
                new String[]{"31", "34", "37", "40"}, 1));

        questions.add(new Question("Football",
                "How many career postseason interceptions did Bill Belichick's defenses force?",
                new String[]{"45", "55", "67", "80"}, 2));

        questions.add(new Question("Football",
                "How many Super Bowl touchdown passes did Joe Montana throw?",
                new String[]{"8", "10", "11", "13"}, 2));

        questions.add(new Question("Football",
                "How many career postseason rushing touchdowns did Emmitt Smith score?",
                new String[]{"14", "17", "19", "22"}, 2));

        // --- Team Records and Streaks ---

        questions.add(new Question("Football",
                "How many regular-season games did the 2007 Patriots win to go 16-0?",
                new String[]{"14", "15", "16", "17"}, 2));

        questions.add(new Question("Football",
                "How many total points did the 1998 Vikings score — then an NFL record?",
                new String[]{"500", "530", "556", "580"}, 2));

        questions.add(new Question("Football",
                "How many regular-season wins did the 1985 Bears have?",
                new String[]{"13", "14", "15", "16"}, 2));

        questions.add(new Question("Football",
                "How many shutouts did the 2000 Ravens defense record?",
                new String[]{"2", "3", "4", "5"}, 2));

        questions.add(new Question("Football",
                "How many rushing yards did the 1978 Patriots' single-game record reach against the Jets?",
                new String[]{"300", "325", "350", "375"}, 2));

        questions.add(new Question("Football",
                "How many consecutive home wins did the 2005-2008 Patriots achieve?",
                new String[]{"15", "18", "21", "24"}, 2));

        questions.add(new Question("Football",
                "How many takeaways did the 1985 Bears defense force?",
                new String[]{"40", "47", "54", "60"}, 2));

        questions.add(new Question("Football",
                "What was the most points scored by a team in a single NFL game?",
                new String[]{"62", "66", "73", "80"}, 2));

        questions.add(new Question("Football",
                "How many total yards did the 2011 Saints offense gain — an NFL record?",
                new String[]{"6,800", "7,100", "7,474", "7,800"}, 2));

        questions.add(new Question("Football",
                "How many consecutive road wins did the 2003-2004 Patriots achieve?",
                new String[]{"7", "8", "10", "12"}, 2));

        // --- Draft Pick Career Stats ---

        questions.add(new Question("Football",
                "How many career passing yards did Ryan Leaf — one of the biggest draft busts — throw for?",
                new String[]{"2,500", "3,100", "3,666", "5,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did JaMarcus Russell throw in 3 NFL seasons?",
                new String[]{"12", "15", "18", "25"}, 2));

        questions.add(new Question("Football",
                "How many career games did Bo Jackson play in the NFL?",
                new String[]{"25", "32", "38", "50"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Bo Jackson accumulate in just 38 games?",
                new String[]{"2,000", "2,400", "2,782", "3,200"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Dan Fouts accumulate?",
                new String[]{"36,000", "39,500", "43,040", "47,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Dan Fouts throw?",
                new String[]{"210", "235", "254", "280"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Terry Bradshaw accumulate?",
                new String[]{"22,000", "25,000", "27,989", "31,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Terry Bradshaw throw?",
                new String[]{"175", "195", "212", "230"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Johnny Unitas accumulate?",
                new String[]{"34,000", "37,000", "40,239", "43,000"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Johnny Unitas throw?",
                new String[]{"250", "270", "290", "310"}, 2));

        // --- Miscellaneous Stat Records ---

        questions.add(new Question("Football",
                "How many career fumble return touchdowns did Jason Taylor score?",
                new String[]{"3", "4", "6", "8"}, 2));

        questions.add(new Question("Football",
                "How many career safeties did Ted Hendricks record — the most in NFL history?",
                new String[]{"2", "3", "4", "5"}, 2));

        questions.add(new Question("Football",
                "How many career defensive touchdowns did Charles Woodson score?",
                new String[]{"8", "10", "13", "16"}, 2));

        questions.add(new Question("Football",
                "What is the NFL record for most tackles in a single NFL season?",
                new String[]{"155", "168", "180", "195"}, 2));

        questions.add(new Question("Football",
                "How many career blocked kicks did Ted Hendricks record?",
                new String[]{"15", "20", "25", "30"}, 2));

        questions.add(new Question("Football",
                "How many career games did Jerry Rice play?",
                new String[]{"270", "285", "303", "320"}, 2));

        questions.add(new Question("Football",
                "How many career Pro Bowl selections did Tony Gonzalez earn?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Tony Gonzalez accumulate?",
                new String[]{"13,000", "14,000", "15,127", "16,000"}, 2));

        questions.add(new Question("Football",
                "How many seasons did Peyton Manning throw 4,000+ passing yards?",
                new String[]{"10", "12", "14", "16"}, 2));

        questions.add(new Question("Football",
                "How many career seasons did Tom Brady play in the NFL?",
                new String[]{"20", "21", "23", "25"}, 2));

        questions.add(new Question("Football",
                "How many career regular-season wins did Tom Brady accumulate as a starter?",
                new String[]{"220", "235", "251", "270"}, 2));

        questions.add(new Question("Football",
                "How many career passing attempts did Brett Favre make — the all-time record?",
                new String[]{"8,800", "9,500", "10,169", "11,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Herschel Walker accumulate?",
                new String[]{"6,500", "7,400", "8,225", "9,000"}, 2));

        questions.add(new Question("Football",
                "How many career All-Pro first-team selections did Jim Brown earn?",
                new String[]{"5", "6", "8", "10"}, 2));

        questions.add(new Question("Football",
                "How many career touchdowns did Jim Brown score?",
                new String[]{"100", "115", "126", "140"}, 2));

        questions.add(new Question("Football",
                "What was the most interceptions by a team in a single season?",
                new String[]{"40", "45", "49", "55"}, 2));

        questions.add(new Question("Football",
                "How many career punt return yards did Brian Mitchell accumulate — the all-time record?",
                new String[]{"4,000", "4,500", "4,999", "5,500"}, 2));

        questions.add(new Question("Football",
                "How many career all-purpose yards did Brian Mitchell accumulate?",
                new String[]{"20,000", "21,500", "23,330", "25,000"}, 2));

        questions.add(new Question("Football",
                "How many career all-purpose yards did Jerry Rice accumulate?",
                new String[]{"20,000", "22,000", "23,546", "25,000"}, 2));

        questions.add(new Question("Football",
                "What was Don Shula's career coaching win total?",
                new String[]{"310", "330", "347", "365"}, 2));

        questions.add(new Question("Football",
                "How many career coaching wins did George Halas accumulate?",
                new String[]{"280", "300", "324", "345"}, 2));

        questions.add(new Question("Football",
                "How many career regular-season coaching wins did Bill Belichick accumulate?",
                new String[]{"270", "285", "302", "320"}, 2));

        questions.add(new Question("Football",
                "How many career coaching wins did Tom Landry accumulate?",
                new String[]{"240", "255", "270", "285"}, 2));

        questions.add(new Question("Football",
                "How many consecutive winning seasons did Tom Landry have with the Cowboys?",
                new String[]{"14", "17", "20", "23"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did T.J. Watt accumulate through 2024?",
                new String[]{"78", "88", "96.5", "105"}, 2));

        questions.add(new Question("Football",
                "How many sacks did T.J. Watt record in 2021 to tie the single-season record?",
                new String[]{"18.5", "20.5", "22.5", "24.5"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Davante Adams accumulate through 2024?",
                new String[]{"9,000", "10,000", "10,990", "12,000"}, 2));

        questions.add(new Question("Football",
                "How many career rushing yards did Nick Chubb accumulate through 2024?",
                new String[]{"5,000", "5,800", "6,511", "7,200"}, 2));

        questions.add(new Question("Football",
                "How many career rushing touchdowns did Derrick Henry score through 2024?",
                new String[]{"78", "88", "99", "110"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Matthew Stafford throw through 2024?",
                new String[]{"290", "315", "335", "360"}, 2));

        questions.add(new Question("Football",
                "How many career Pro Bowl selections did Larry Fitzgerald earn?",
                new String[]{"8", "9", "11", "13"}, 2));

        questions.add(new Question("Football",
                "How many career receiving touchdowns did Larry Fitzgerald score?",
                new String[]{"100", "110", "121", "135"}, 2));

        questions.add(new Question("Football",
                "How many career receiving yards did Mike Evans accumulate through 2024?",
                new String[]{"10,500", "11,500", "12,594", "13,500"}, 2));

        questions.add(new Question("Football",
                "How many consecutive 1,000-yard receiving seasons did Mike Evans have through 2024?",
                new String[]{"7", "8", "10", "12"}, 2));

        questions.add(new Question("Football",
                "How many career interceptions did Darrelle Revis accumulate?",
                new String[]{"22", "25", "29", "35"}, 2));

        questions.add(new Question("Football",
                "How many career pass deflections did Richard Sherman accumulate?",
                new String[]{"90", "100", "116", "130"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Aaron Donald accumulate through 2024?",
                new String[]{"95", "103", "111", "120"}, 2));

        questions.add(new Question("Football",
                "How many times was Aaron Donald named First-Team All-Pro?",
                new String[]{"5", "6", "8", "10"}, 2));

        questions.add(new Question("Football",
                "How many career sacks did Khalil Mack accumulate through 2024?",
                new String[]{"82", "92", "102", "112"}, 2));

        questions.add(new Question("Football",
                "How many career passing touchdowns did Patrick Mahomes throw through 2024?",
                new String[]{"190", "210", "227", "250"}, 2));

        questions.add(new Question("Football",
                "How many career passing yards did Patrick Mahomes accumulate through 2024?",
                new String[]{"27,000", "30,000", "32,780", "36,000"}, 2));
    }
}
