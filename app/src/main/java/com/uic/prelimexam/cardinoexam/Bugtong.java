package com.uic.prelimexam.cardinoexam;

/**
 * Created by Rannie Claire on 1/15/2018.
 */
public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 51;          //Array maximum size
    public final int TOTAL_SIZE = 51;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;
    public static int answered = 0;
    public static int items = 0;
    public static int questionAnswered = 0; /*Scoring Rule:
                                              if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "Same bed but it feels just a little bit bigger now";
        choices[0][0] = "When I Was Your Man";
        choices[0][1] = "Count On Me";
        choices[0][2] = "Talking To The Moon";
        choices[0][3] = "It Will Rain";
        answer[0] = "A";

        bugtong[1] = "When you smile, the whole world stops and stares for a while";
        choices[1][0] = "Marry You";
        choices[1][1] = "Just The Way You Are";
        choices[1][2] = "Locked Out Of Heaven";
        choices[1][3] = " Treasure";
        answer[1] = "B";

        bugtong[2] = "Mad woman, bad woman, that's just what you are.";
        choices[2][0] = "Grenade";
        choices[2][1] = "Natalie";
        choices[2][2] = "Faded";
        choices[2][3] = "Talking To The Moon";
        answer[2] = "A";

        bugtong[3] = "Mad woman, bad woman, that's just what you are";
        choices[3][0] = "Faded";
        choices[3][1] = "Natalie";
        choices[3][2] = "Grenaded";
        choices[3][3] = "Talking To The Moon";
        answer[3] = "C";

        bugtong[4] = "A girl like you should never look so blue";
        choices[4][0] = " It Will Rain";
        choices[4][1] = "Don't Give Up";
        choices[4][2] = "Starting Today";
        choices[4][3] = "Treasure";
        answer[4] = "D";

        bugtong[5] = "I bet my old man will be so proud of me";
        choices[5][0] = "Rest Of My Life";
        choices[5][1] = "Our First Time";
        choices[5][2] = "The Lazy Song";
        choices[5][3] = " Count On Me";
        answer[5] = "C";

        bugtong[6] = "Oh, look what you're doing, look what you've done";
        choices[6][0] = "Gorilla";
        choices[6][1] = "Faded";
        choices[6][2] = "Moonshine";
        choices[6][3] = "Grenade";
        answer[6] = "A";

        bugtong[7] = "There's no religion that could save me";
        choices[7][0] = " Faded";
        choices[7][1] = "Talking To The Moon";
        choices[7][2] = "If I Knew";
        choices[7][3] = "It Will Rain";
        answer[7] = "D";

        bugtong[8] = "You can make a sinner change his ways";
        choices[8][0] = "Rest Of My Life";
        choices[8][1] = "Locked Out Of Heaven";
        choices[8][2] = "Natalie";
        choices[8][3] = "Count On Me";
        answer[8] = "B";

        bugtong[9] = "If we wake up and you wanna break up, that's cool";
        choices[9][0] = "Marry You";
        choices[9][1] = "Our First Time";
        choices[9][2] = "Treasure";
        choices[9][3] = "Just The Way You Are";
        answer[9] = "A";

        bugtong[10] = "All these roads steer me wrong, but I still drive them all night long";
        choices[10][0] = "If I Knew";
        choices[10][1] = "Grenade";
        choices[10][2] = "Young Girls";
        choices[10][3] = "Moonshine";
        answer[10] = "C";

        bugtong[11] = "Well, I'll just keep on making the same mistakes";
        choices[11][0] = "I See Fire";
        choices[11][1] = "All Of The Stars";
        choices[11][2] = "Thinking Out Loud";
        choices[11][3] = "The A Team";
        answer[11] = "C";

        bugtong[12] = "We'll play hide and seek to turn this around";
        choices[12][0] = "Sing";
        choices[12][1] = "Give Me Love";
        choices[12][2] = "Small Bump";
        choices[12][3] = "Everything Has Changed";
        answer[12] = "B";

        bugtong[13] = "See, I�m true, my songs are where my heart is";
        choices[13][0] = "Drunk";
        choices[13][1] = "You Need Me, I Don't Need You";
        choices[13][2] = "Make It Rain";
        choices[13][3] = "Everything Has Changed";
        answer[13] = "B";

        bugtong[14] = "Raise a glass of wine for the last time";
        choices[14][0] = "Don't";
        choices[14][1] = "Watchtower";
        choices[14][2] = "One Night";
        choices[14][3] = "I See Fire";
        answer[14] = "D";

        bugtong[15] = "The worst things in life come free to us";
        choices[15][0] = "Thinking Out Loud";
        choices[15][1] = "No Luck";
        choices[15][2] = "The A Team";
        choices[15][3] = "Firefly";
        answer[15] = "C";

        bugtong[16] = "So open your eyes and see the way our horizons meet";
        choices[16][0] = "The A Team";
        choices[16][1] = "Make It Rain";
        choices[16][2] = "Sing";
        choices[16][3] = "All Of The Stars";
        answer[16] = "D";

        bugtong[17] = "told her I'm not really looking for another mistake.";
        choices[17][0] = "Don't";
        choices[17][1] = "You Need Me, I Don't Need You";
        choices[17][2] = "I See Fire";
        choices[17][3] = "Give Me Love";
        answer[17] = "D";

        bugtong[18] = "Where would Bruno take a bullet straight through for you?";
        choices[18][0] = "His Heart";
        choices[18][1] = "His Eye";
        choices[18][2] = "His Brain";
        choices[18][3] = "His Back";
        answer[18] = "C";

        bugtong[19] = "What magazine does Bruno want to be on the cover of next to Oprah and the Queen?";
        choices[19][0] = "Forbes";
        choices[19][1] = "O";
        choices[19][2] = "People";
        choices[19][3] = "Time";
        answer[19] = "A";

        bugtong[20] = "If you ever leave Bruno, what should you leave at his door?";
        choices[20][0] = "Morphine";
        choices[20][1] = "Codeine";
        choices[20][2] = "OxyContin";
        choices[20][3] = "Opium";
        answer[20] = "A";

        bugtong[21] = "Bruno will sail the world to find you if you're stuck where?";
        choices[21][0] = "In The Middle of The River";
        choices[21][1] = "In The Middle of The Lake";
        choices[21][2] = "In The Middle of The Sea";
        choices[21][3] = "In The Middle of The Ocean";
        answer[21] = "A";

        bugtong[22] = "Bruno is a dangerous man with what in his pocket?";
        choices[22][0] = "A Knife";
        choices[22][1] = "Some Money";
        choices[22][2] = "His Phone";
        choices[22][3] = "His Wallet";
        answer[22] = "B";

        bugtong[23] = "Shout out to the girls that pay what on time?";
        choices[23][0] = "Their Mortgage";
        choices[23][1] = "Their Bills";
        choices[23][2] = "Their Credit Cards";
        choices[23][3] = "Their Rent";
        answer[23] = "D";

        bugtong[24] = "Why did Natalie run away with all Bruno's money?";
        choices[24][0] = "To Bribe";
        choices[24][1] = "For Fun";
        choices[24][2] = "To Gamble";
        choices[24][3] = "For Drugs";
        answer[24] = "B";

        bugtong[25] = "What dance can MTV teach Bruno how to do?";
        choices[25][0] = "Dab";
        choices[25][1] = "Dougie";
        choices[25][2] = "Macarena";
        choices[25][3] = "Cupid Shuffle";
        answer[25] = "B";

        bugtong[26] = "What does her hair do perfectly without her trying?";
        choices[26][0] = "Shines";
        choices[26][1] = "Gleams";
        choices[26][2] = "Grows";
        choices[26][3] = "Falls";
        answer[26] = "D";

        bugtong[27] = "Bruno is so hot, what does a dragon want to do?";
        choices[27][0] = "Watch";
        choices[27][1] = "Retire";
        choices[27][2] = "Fly";
        choices[27][3] = "Fight";
        answer[27] = "B";

        bugtong[28] = "Lucky for you, what kind of champagne does Bruno like?";
        choices[28][0] = "Pear";
        choices[28][1] = "Peach";
        choices[28][2] = "Grape";
        choices[28][3] = "Strawberry";
        answer[28] = "D";

        bugtong[29] = "What is NOT something Bruno should have done when he was your man?";
        choices[29][0] = "Take You To Every Party";
        choices[29][1] = "Marry You";
        choices[29][2] = "Bought You Flowers";
        choices[29][3] = "Held Your Hand";
        answer[29] = "B";

        bugtong[30] = "What is NOT something Bruno should have done when he was your man?";
        choices[30][0] = "Take You To Every Party";
        choices[30][1] = "Marry You";
        choices[30][2] = "Bought You Flowers";
        choices[30][3] = "Held Your Hand";
        answer[30] = "A";

        bugtong[31] = "What designer brand does Bruno want on the floor?";
        choices[31][0] = "Versace";
        choices[31][1] = "Prada";
        choices[31][2] = "Chanel";
        choices[31][3] = "Armani";
        answer[31] = "A";

        bugtong[32] = "What does Bruno never want to put on the line?";
        choices[32][0] = "His Money";
        choices[32][1] = "His Heart";
        choices[32][2] = "His Head";
        choices[32][3] = "His Life";
        answer[32] = "B";

        bugtong[33] = "Where did you belong to Taylor";
        choices[33][0] = "With you?";
        choices[33][1] = "With me";
        choices[33][2] = "With her";
        choices[33][3] = "With them";
        answer[33] = "B";

        bugtong[34] = "When Taylor was 5 years old, she didn't know the location of whose house?";
        choices[34][0] = "Rapunzel";
        choices[34][1] = "Hansel and Gretel";
        choices[34][2] = "Snow White";
        choices[34][3] = "Cinderella";
        answer[34] = "C";

        bugtong[35] = "What kind of daydream look do you have in your eyes?";
        choices[35][0] = "Dean Martin";
        choices[35][1] = "James Franco";
        choices[35][2] = "James Dean";
        choices[35][3] = "Marlon Brando";
        answer[35] = "C";

        bugtong[36] = "What is Taylor standing on in the summer air?";
        choices[36][0] = "The patio";
        choices[36][1] = "The gazebo";
        choices[36][2] = "The deck";
        choices[36][3] = "The balcony";
        answer[36] = "D";

        bugtong[37] = "When you almost broke up last night, what did Taylor throw across the room?";
        choices[37][0] = "Her food";
        choices[37][1] = "Her hairdryer";
        choices[37][2] = "Her phone";
        choices[37][3] = "Her purse";
        answer[37] = "C";

        bugtong[38] = "She's cheer captain and where is Taylor?";
        choices[38][0] = "On the field";
        choices[38][1] = "In the stands";
        choices[38][2] = "On the bleachers";
        choices[38][3] = "In the lab";
        answer[38] = "C";

        bugtong[39] = "What does it do in Taylor's room when everything is wrong?";
        choices[39][0] = "Burns";
        choices[39][1] = "Storms";
        choices[39][2] = "Snows";
        choices[39][3] = "Rains";
        answer[39] = "D";

        bugtong[40] = "Drew is the only thing that keeps Taylor wishing on what?";
        choices[40][0] = "A wishing penny";
        choices[40][1] = "A wishing star";
        choices[40][2] = "A wishing fountain";
        choices[40][3] = "A wishing well";
        answer[40] = "B";

        bugtong[41] = "What doesn't fix bullet holes?";
        choices[41][0] = "Neosporin";
        choices[41][1] = "Band-aids";
        choices[41][2] = "Gauze";
        choices[41][3] = "Stitches";
        answer[41] = "B";

        bugtong[42] = "Years from now, what will you be grumbling about?";
        choices[42][0] = "How Taylor can't dance";
        choices[42][1] = "How Taylor is mean";
        choices[42][2] = "How Taylor is gone";
        choices[42][3] = "How Taylor can't sing";
        answer[42] = "D";

        bugtong[43] = "What is the red-head's name that Taylor sits next to in class?";
        choices[43][0] = "Ashley";
        choices[43][1] = "Anna";
        choices[43][2] = "Abigail";
        choices[43][3] = "Amanda";
        answer[43] = "C";

        bugtong[44] = "What does Taylor have a long list of?";
        choices[44][0] = "Rhymes";
        choices[44][1] = "Names";
        choices[44][2] = "Ex-Lovers";
        choices[44][3] = "Starbucks Lovers";
        answer[44] = "C";

        bugtong[45] = "Where does Taylor want to ask you to dance?";
        choices[45][0] = "In the middle of the parking lot";
        choices[45][1] = "In the middle of the street";
        choices[45][2] = "In the middle of the woods";
        choices[45][3] = "In the middle of town";
        answer[45] = "A";

        bugtong[46] = "When was there a month of tears?";
        choices[46][0] = "November";
        choices[46][1] = "October";
        choices[46][2] = "December";
        choices[46][3] = "September";
        answer[46] = "D";

        bugtong[47] = "What is NOT part of their song?";
        choices[47][0] = "The rev of your truck";
        choices[47][1] = "A slamming screen door";
        choices[47][2] = "The way you laugh";
        choices[47][3] = "Tapping on your window";
        answer[47] = "A";

        bugtong[48] = "In the dark days, what crept into Taylor's mind?";
        choices[48][0] = "Sadness";
        choices[48][1] = "Distress";
        choices[48][2] = "Goodbye";
        choices[48][3] = "Fear";
        answer[48] = "D";

        bugtong[49] = "Loving him was like driving what kind of car down a dead-end street?";
        choices[49][0] = "Mercedes-Benz";
        choices[49][1] = "Ferrari";
        choices[49][2] = "Maserati";
        choices[49][3] = "Lamborghini";
        answer[49] = "C";

        bugtong[50] = "What is the red-head's name that Taylor sits next to in class?";
        choices[50][0] = "Ashley";
        choices[50][1] = "Anna";
        choices[50][2] = "Hita";
        choices[50][3] = "Abigail";
        answer[50] = "D";
    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
