package com.example.sportstrivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {

    private List<Question> questions;

    public QuestionBank() {
        questions = new ArrayList<>();
        loadBaseballQuestions();
        loadFootballQuestions();
    }

    public List<Question> getShuffledQuestions() {
        List<Question> shuffled = new ArrayList<>(questions);
        Collections.shuffle(shuffled);
        return shuffled;
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
                "What was the largest margin of victory in Super Bowl history (Super Bowl XXIV)?",
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
    }
}
