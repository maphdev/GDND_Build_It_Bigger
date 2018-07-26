package com.example.jokesproviderlibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokesProvider {
    private static List<String> jokesCollection = Arrays.asList("How do you make a tissue dance? You put a little boogie in it.",
            "Why did the policeman smell bad? He was on duty.",
            "Why does Snoop Dogg carry an umbrella? FO DRIZZLE!",
            "Why can’t you hear a pterodactyl in the bathroom? Because it has a silent pee.",
            "What did the Zen Buddist say to the hotdog vendor? Make me one with everything.",
            "What kind of bees make milk instead of honey? Boobies.",
            "Horse walks into a bar. Bartender says, “Why the long face?”",
            "A mushroom walks into a bar. The bartender says, “Hey, get out of here! We don’t serve mushrooms here”. Mushroom says, “why not? I’m a fungai!”",
            "I never make mistakes…I thought I did once; but I was wrong.",
            "What’s Beethoven’s favorite fruit?…Ba-na-na-naaa!",
            "What did the little fish say when he swam into a wall? DAM!",
            "Knock knock. Who’s there? Smell mop. (finish this joke in your head)",
            "Where does a sheep go for a haircut? To the baaaaa baaaaa shop!",
            "What does a nosey pepper do? Gets jalapeno business!",
            "What do you call a deer with no eyes? No eye deer.",
            "What’s the last thing that goes thru a bug’s mind as he hits the windshield? His butt.",
            "Knock knock- who’s there? Dwayne. Dwayne who? Dwayne the tub I’m dwounding!",
            "The past, present and future walk into a bar. It was tense.",
            "What goes “ha ha thump”? A man laughing his head off.",
            "What did the grape say when he was pinched? Nothing, he gave a little wine.",
            "What’s brown and sticky? A stick!",
            "Why are pirates so mean? I don’t know, they just arrrrrrrrr!",
            "Why was Tigger looking in the toilet? He was looking for Pooh!",
            "What do you get when you throw a piano down a mine shaft? A flat miner.",
            "Have you heard about the cannibal that passed his brother in the forest?",
            "Who’s there?” … “Control freak. Okay now you say, ‘Control freak who?”",
            "What do you call cheese that’s not yours? It’s nacho cheese.",
            "What do you get when you put a candle in a suit of armor? A knight light.",
            "Have you heard about corduroy pillows?! They’re making headlines!",
            "Two drums and a cymbal fall off a cliff. Ba-dum Tish!");

    public String getRandomJoke() {
        Random random = new Random();
        String randomJoke = jokesCollection.get(random.nextInt(jokesCollection.size()));
        return randomJoke;
    }

    public static List<String> getJokesCollection() {
        return jokesCollection;
    }
}
