package com.condconv.streaming.children;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

class RandomGenerator {
    static final int NUMBER_OF_CHILDREN = 1000000;

    private static final int NUMBER_OF_MUGGLES = NUMBER_OF_CHILDREN - 100;
    private static final List<String> firstNames = asList("Abel", "Adam", "Adan", "Alan", "Aldo", "Alec", "Amir", "Amos", "Aram", "Ari", "Arlo", "Arndt", "Asa", "Axel", "Beau", "Blaise", "Blaine", "Boyd", "Bram", "Brett", "Brent", "Bryn", "Cai", "Cain", "Carl", "Cian", "Clark", "Claus", "Cole", "Colm", "Craig", "Dean", "Dion", "Eli", "Elis", "Enzo", "Eric", "Ernst", "Esau", "Ezio", "Ezra", "Ewan", "Evan", "Fulk", "Finn", "Flynn", "Frank", "Franz", "Gael", "Gene", "Giles", "Glenn", "Grant", "Greer", "Greig", "Grey", "Guy", "Hans", "Heath", "Hugh", "Hugo", "Ian", "Ioan", "Ivan", "Ivo", "Ivor", "Iwan", "Jago", "Jair", "Joah", "Joel", "Jory", "Jude", "Kai", "Keir", "Keith", "Kerr", "Kurt", "Lars", "Leif", "Lee", "Leo", "Leon", "Lev", "Levi", "Lex", "Liam", "Lloyd", "Loic", "Luke", "Luca", "Ludo", "Mac", "Max", "Miles", "Milo", "Neil", "Nico", "Nils", "Noah", "Noam", "Noel", "Otis", "Otto", "Owen", "Rafe", "Ralph", "Reid", "Rex", "Rhett", "Rhys", "Rio", "Ross", "Saul", "Scott", "Sean", "Seth", "Tate", "Teo", "Theo", "Thor", "Todd", "Urs", "Vaughn", "Veit", "Wolfe", "Zeno", "Ada", "Aida", "Aila", "Aili", "Alda", "Alix", "Alma", "Alya", "Alys", "Amy", "Anya", "Ann", "Anna", "Aria", "Asha", "Ava", "Ayla", "Belle", "Bliss", "Blythe", "Cadi", "Cati", "Cara", "Cher", "Claire", "Clea", "Clio", "Cora", "Dawn", "Demi", "Devi", "Dido", "Dora", "Eden", "Eira", "Elen", "Ella", "Elsa", "Emma", "Ena", "Erin", "Esme", "Etta", "Eva", "Eve", "Faye", "Fern", "Fleur", "Fflur", "Gaia", "Gia", "Grace", "Gwen", "Gyda", "Hebe", "Hera", "Hero", "Hope", "Ida", "Ines", "Inga", "Iole", "Iona", "Ione", "Iris", "Isis", "Isla", "Iva", "Ivy", "Jade", "Jael", "Jane", "Jaya", "Joy", "June", "Juno", "Jytte", "Kyra", "Lani", "Lara", "Leah", "Leda", "Leigh", "Lena", "Leta", "Lila", "Lily", "Liv", "Lois", "Lucy", "Luna", "Lynn", "Lyra", "Maeve", "Maya", "Mali", "Mara", "Mari", "Mary", "Maud", "May", "Mia", "Mila", "Mina", "Mira", "Mona", "Nia", "Niamh", "Nina", "Noa", "Nola", "Nora", "Opal", "Orla", "Peta", "Rhea", "Rose", "Ruby", "Ruth", "Sian", "Skye", "Tara", "Tess", "Thea", "Vera", "Zita", "Zoe", "Zora");
    private static final List<String> lastNames = asList("Smith", "Corbyn", "Jones", "Zuerlein", "Brown", "Hall", "Aujla", "Wilson", "Checo", "Armstrong", "Lahren", "Walker", "Harmston", "Titcomb", "Davies", "Hughes", "Clarke", "Thompson", "Potts", "Taylor", "Wright", "Collins", "Waldron", "Williams", "Gough", "Marshall", "Kemp", "Luke", "Dwumfour", "Lord", "Devereux", "Cox", "Story", "Rose", "Bain", "Robinson", "Kee", "Wardell", "Islam", "Mogg", "Duncan", "MacDonald", "Briggs", "Jackson", "Turner", "Green", "Gellender", "Thomas", "Jonas", "Look", "Dobbins", "Archer", "Crossman", "Saunders", "Wren", "Dungey", "Jago", "Caradus", "Warrell", "Painter", "Baldwin", "Degg", "Riley", "Seymour", "Surman", "Wilkinson", "Bailey", "Arnold", "Starling", "Feakes", "Morris", "Welby", "Edwards", "Atkinson", "Espinal", "Young", "Jackman", "Callanta", "Ching", "Harris", "Morfa", "Tyrrell", "Anderson", "Meller", "Morgan", "Ware", "Drinkwater", "Power", "Firth", "Shergold", "Webster", "Annetts", "Stephenson", "Reid", "Allen", "Griffiths", "File", "Buckley", "Moore", "Skelly");
    private static final List<String> cities = asList("Aberdeen, Scotland", "Armagh, Northern Ireland", "Bangor, Wales", "Bath, England", "Belfast, Northern Ireland", "Birmingham, England", "Bradford, England", "Brighton & Hove, England", "Bristol, England", "Cambridge, England", "Canterbury, England", "Cardiff, Wales", "Carlisle, England", "Chelmsford, England", "Chester, England", "Chichester, England", "Coventry, England", "Derby, England", "Derry, Northern Ireland", "Dundee, Scotland", "Durham, England", "Edinburgh, Scotland", "Ely, England", "Exeter, England", "Glasgow, Scotland", "Gloucester, England", "Hereford, England", "Inverness, Scotland", "Kingston upon Hull, England", "Lancaster, England", "Leeds, England", "Leicester, England", "Lichfield, England", "Lincoln, England", "Lisburn, Northern Ireland", "Liverpool, England", "London, England", "Manchester, England", "Newcastle upon Tyne, England", "Newport, Wales", "Newry, Northern Ireland", "Norwich, England", "Nottingham, England", "Oxford, England", "Perth, Scotland", "Peterborough, England", "Plymouth, England", "Portsmouth, England", "Preston, England", "Ripon, England", "St Albans, England", "St Asaph, Wales", "St Davids, Wales", "Salford, England", "Salisbury, England", "Sheffield, England", "Southampton, England", "Stirling, Scotland", "Stoke-on-Trent, England", "Sunderland, England", "Swansea, Wales", "Truro, England", "Wakefield, England", "Wells, England", "Winchester, England", "Wolverhampton, England", "Worcester, England", "York, England");
    private static final List<String> streets = asList("Beach Boulevard", "Belmont Street", "George Street", "Guild Street", "Shiprow", "Union Street", "Union Terrace", "Argyle Street", "Bath Street", "Bathwick Street", "Camden Crescent", "Cavendish Crescent", "Cheap Street", "Duke Street", "Gay Street", "Great Pulteney Street", "Grosvenor Place", "Henrietta Street", "Johnstone Street", "Kingsmeade Square", "Landsdown Crescent", "Laura Place", "Milsom Street", "Nelson Place West", "Nile Street", "Norfolk Crescent", "North Parade", "Pierrepont Place", "Portland Place", "Queen Square", "Royal Crescent", "Sion Hill Place", "Somerset Place", "South Parade", "St James's Square", "Stall Street", "Sydney Place", "Trim Street", "Upper Borough Walls", "Widcombe Crescent", "Wood Street", "Antrim Road", "Botanic Avenue", "Cluan Place", "Crumlin Road", "Donegall Road", "Falls Road", "Great Victoria Street", "Lisburn Road", "Malone Park", "Ormeau Road", "Royal Avenue", "Sandy Row", "Shaftesbury Square", "Shankill Road", "Shaw's Road", "Shore Road", "Stranmills", "Whitewell Road");

    private static final Random random = new Random();

    static Child getRandomChild(int i) {
        String firstName = getRandomFirstName();
        String lastName = getRandomLastName();
        return Child.builder()
                .id("" + i + "")
                .name(buildName(firstName, lastName))
                .muggle(getIsMuggle())
                .email(buildEmail(firstName, lastName))
                .address(buildRandomAddress())
                .phone(buildPhone())
                .siblings(asList(buildSiblings(lastName))
                )
                .build();
    }

    private static boolean getIsMuggle() {
        return random.nextInt(NUMBER_OF_CHILDREN) < NUMBER_OF_MUGGLES;
    }

    private static String buildEmail(String firstName, String lastName) {
        return firstName + "@" + lastName + ".co.uk";
    }

    private static String buildName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static String getRandomFirstName() {
        return firstNames.get(random.nextInt(firstNames.size()));
    }

    private static String getRandomLastName() {
        return lastNames.get(random.nextInt(lastNames.size()));
    }

    private static String[] buildSiblings(String lastName) {
        String[] siblings = new String[random.nextInt(6)];
        for (int i = 0; i < siblings.length; i++) {
            siblings[i] = buildName(getRandomFirstName(), lastName);
        }
        return siblings;
    }

    private static Address buildRandomAddress() {
        String line = "" + random.nextInt(1000) + " " + streets.get(random.nextInt(streets.size()));
        String city = cities.get(random.nextInt(cities.size()));

        return Address.builder()
                .line(line)
                .city(city)
                .build();
    }

    private static String buildPhone() {
        return String.valueOf(random.nextInt((999999999 - 100000000) + 1) + 100000000);
    }

}
