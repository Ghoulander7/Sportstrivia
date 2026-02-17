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
        // Source: baseball-reference.com/leaders/HR_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career home run record with 762 home runs?",
                new String[]{"Hank Aaron", "Babe Ruth", "Barry Bonds", "Alex Rodriguez"}, 2));

        // Source: baseball-reference.com/leaders/H_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career hits record with 4,256 hits?",
                new String[]{"Ty Cobb", "Pete Rose", "Hank Aaron", "Stan Musial"}, 1));

        // Source: baseball-reference.com/leaders/SO_p_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career strikeouts record for pitchers with 5,714 strikeouts?",
                new String[]{"Roger Clemens", "Randy Johnson", "Steve Carlton", "Nolan Ryan"}, 3));

        // Source: baseball-reference.com/leaders/W_career.shtml
        questions.add(new Question("Baseball",
                "Which pitcher holds the MLB all-time career wins record with 511 victories?",
                new String[]{"Walter Johnson", "Cy Young", "Grover Alexander", "Christy Mathewson"}, 1));

        // Source: baseball-reference.com/leaders/SB_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career stolen bases record with 1,406 steals?",
                new String[]{"Lou Brock", "Ty Cobb", "Rickey Henderson", "Tim Raines"}, 2));

        // Source: baseball-reference.com/leaders/HR_season.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB single-season home run record with 73 home runs in 2001?",
                new String[]{"Mark McGwire", "Sammy Sosa", "Babe Ruth", "Barry Bonds"}, 3));

        // Source: baseball-reference.com/leaders/batting_avg_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the highest career batting average in MLB history at .366?",
                new String[]{"Rogers Hornsby", "Joe Jackson", "Ted Williams", "Ty Cobb"}, 3));

        // Source: baseball-reference.com/leaders/SV_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career saves record with 652 saves?",
                new String[]{"Trevor Hoffman", "Mariano Rivera", "Lee Smith", "Craig Kimbrel"}, 1));

        // Source: baseball-reference.com/leaders/RBI_career.shtml
        questions.add(new Question("Baseball",
                "Who holds the MLB all-time career RBI record with 2,297 RBIs?",
                new String[]{"Babe Ruth", "Albert Pujols", "Hank Aaron", "Alex Rodriguez"}, 2));

        // Source: baseball-reference.com - Yankees World Series history
        questions.add(new Question("Baseball",
                "Which MLB team has won the most World Series titles with 27 championships?",
                new String[]{"St. Louis Cardinals", "Boston Red Sox", "New York Yankees", "Los Angeles Dodgers"}, 2));

        // Source: baseball-reference.com/leaders/earned_run_avg_career.shtml
        questions.add(new Question("Baseball",
                "Which pitcher holds the lowest career ERA in MLB history at 1.82?",
                new String[]{"Addie Joss", "Walter Johnson", "Ed Walsh", "Christy Mathewson"}, 2));

        // Source: Well-established MLB history - Ichiro 2004 season
        questions.add(new Question("Baseball",
                "Who set the MLB single-season hits record with 262 hits in 2004?",
                new String[]{"Pete Rose", "George Sisler", "Ichiro Suzuki", "Wade Boggs"}, 2));

        // Source: Well-established MLB history - DiMaggio hitting streak
        questions.add(new Question("Baseball",
                "Who holds the MLB record for the longest hitting streak at 56 consecutive games?",
                new String[]{"Ted Williams", "Pete Rose", "Ty Cobb", "Joe DiMaggio"}, 3));

        // Source: Well-established MLB history
        questions.add(new Question("Baseball",
                "How many stitches are on an official Major League Baseball?",
                new String[]{"88", "108", "120", "98"}, 1));

        // Source: Well-established MLB history - Jackie Robinson
        questions.add(new Question("Baseball",
                "What number is retired across all of Major League Baseball in honor of Jackie Robinson?",
                new String[]{"21", "42", "44", "7"}, 1));
    }

    private void loadFootballQuestions() {
        // Source: pro-football-reference.com/leaders/pass_yds_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career passing yards record with 89,214 yards?",
                new String[]{"Peyton Manning", "Drew Brees", "Tom Brady", "Brett Favre"}, 2));

        // Source: pro-football-reference.com/leaders/rush_yds_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career rushing yards record with 18,355 yards?",
                new String[]{"Walter Payton", "Barry Sanders", "Emmitt Smith", "Frank Gore"}, 2));

        // Source: pro-football-reference.com/leaders/rec_yds_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career receiving yards record with 22,895 yards?",
                new String[]{"Larry Fitzgerald", "Terrell Owens", "Randy Moss", "Jerry Rice"}, 3));

        // Source: pro-football-reference.com/leaders/pass_td_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career passing touchdowns record with 649 touchdowns?",
                new String[]{"Drew Brees", "Peyton Manning", "Aaron Rodgers", "Tom Brady"}, 3));

        // Source: ESPN, NFL history - Super Bowl wins
        questions.add(new Question("Football",
                "Which two NFL teams are tied for the most Super Bowl wins with 6 championships each?",
                new String[]{"Cowboys & 49ers", "Patriots & Steelers", "Packers & Giants", "Cowboys & Patriots"}, 1));

        // Source: pro-football-reference.com - Single season passing yards
        questions.add(new Question("Football",
                "Who holds the NFL single-season passing yards record with 5,477 yards in 2013?",
                new String[]{"Drew Brees", "Tom Brady", "Patrick Mahomes", "Peyton Manning"}, 3));

        // Source: pro-football-reference.com - Single season rushing yards
        questions.add(new Question("Football",
                "Who holds the NFL single-season rushing yards record with 2,105 yards in 1984?",
                new String[]{"Barry Sanders", "Adrian Peterson", "Eric Dickerson", "Emmitt Smith"}, 2));

        // Source: pro-football-reference.com/leaders/sacks_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career sacks record with 200 sacks?",
                new String[]{"Reggie White", "Bruce Smith", "Kevin Greene", "Julius Peppers"}, 1));

        // Source: pro-football-reference.com/leaders/def_int_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career interceptions record with 81 interceptions?",
                new String[]{"Rod Woodson", "Night Train Lane", "Paul Krause", "Emlen Tunnell"}, 2));

        // Source: Super Bowl MVP history - pro-football-reference.com
        questions.add(new Question("Football",
                "Which player has won the most Super Bowl MVP awards with 5?",
                new String[]{"Joe Montana", "Patrick Mahomes", "Tom Brady", "Terry Bradshaw"}, 2));

        // Source: pro-football-reference.com/leaders/rec_career.htm
        questions.add(new Question("Football",
                "Who holds the NFL all-time career receptions record with 1,549 catches?",
                new String[]{"Tony Gonzalez", "Larry Fitzgerald", "Jerry Rice", "Jason Witten"}, 2));

        // Source: pro-football-reference.com - Single season TDs
        questions.add(new Question("Football",
                "Who holds the NFL single-season passing touchdowns record with 55 TDs in 2013?",
                new String[]{"Tom Brady", "Patrick Mahomes", "Dan Marino", "Peyton Manning"}, 3));

        // Source: Well-established NFL history - Vince Lombardi Trophy
        questions.add(new Question("Football",
                "The Super Bowl trophy is named after which legendary NFL coach?",
                new String[]{"Tom Landry", "Don Shula", "Vince Lombardi", "Paul Brown"}, 2));

        // Source: Well-established NFL history - 1972 Dolphins
        questions.add(new Question("Football",
                "Which team completed the only perfect season (including Super Bowl win) in NFL history in 1972?",
                new String[]{"Pittsburgh Steelers", "Dallas Cowboys", "Miami Dolphins", "Green Bay Packers"}, 2));

        // Source: Well-established NFL history - Pro Football Hall of Fame
        questions.add(new Question("Football",
                "In which city is the Pro Football Hall of Fame located?",
                new String[]{"New York, NY", "Canton, OH", "Green Bay, WI", "Dallas, TX"}, 1));
    }
}
