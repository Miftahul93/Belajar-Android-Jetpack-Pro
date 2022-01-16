package com.mieftah.moviecatalogueapp.utils

import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.data.source.remote.response.GenreResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse

object DataDummy {
    fun getMovies(): ArrayList<DataEntity> {
        return arrayListOf(
            DataEntity(
                634649,
                "Spider-Man: No Way Home",
                "2021-12-15",
                genres = listOf("Action, Adventure, Science Fiction"),
                148,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                8.4f,
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg"
            ),

            DataEntity(
                568124,
                "Encanto",
                "2021-11-24",
                listOf("Animation, Comedy, Family, Fantasy"),
                102,
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                7.8f,
                "/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg"
            ),

            DataEntity(
                460458,
                "Resident Evil: Welcome to Raccoon City",
                "2021-11-24",
                listOf("Horror, Action, Science Fiction"),
                107,
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                6f,
                "/6WR7wLCX0PGLhj51qyvK8MIxtT5.jpg"
            ),

            DataEntity(
                624860,
                "The Matrix Resurrections",
                "2021-12-16",
                listOf("Adventure, Action, Science Fiction"),
                148,
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                7f,
                "/gZlZLxJMfnSeS60abFZMh1IvODQ.jpg"
            ),

            DataEntity(
                580489,
                "Venom: Let There Be Carnage",
                "2021-09-30",
                listOf("Science Fiction, Action, Adventure"),
                97,
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                7.2f,
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg"
            ),

            DataEntity(
                512195,
                "Red Notice",
                "2021-11-04",
                listOf("Action, Comedy, Crime, Thriller"),
                117,
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                6.8f,
                "/lAXONuqg41NwUMuzMiFvicDET9Y.jpg"
            ),

            DataEntity(
                438695,
                "Sing 2",
                "2021-12-01",
                listOf("Animation, Comedy, Family, Music"),
                110,
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                7.5f,
                "/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg"
            ),

            DataEntity(
                425909,
                "Ghostbusters: Afterlife",
                "2021-11-11",
                listOf("Comedy, Fantasy, Adventure"),
                124,
                "When a single mom and her two kids arrive in a small town, they begin to discover their connection to the original Ghostbusters and the secret legacy their grandfather left behind.",
                7.2f,
                "/sg4xJaufDiQl7caFEskBtQXfD4x.jpg"
            ),

            DataEntity(
                566525,
                "Shang-Chi and the Legend of the Ten Rings",
                "2021-09-01",
                listOf("Action, Adventure, Fantasy"),
                132,
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                7.8f,
                "/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg"
            ),

            DataEntity(
                787310,
                "Survive the Game",
                "2021-10-08",
                listOf("Action, Thriller, Crime"),
                97,
                "An enchanting making-of story told through all-new in-depth interviews and cast conversations, inviting fans on a magical first-person journey through one of the most beloved film franchises of all time.",
                5.9f,
                "/xF1uc2pEf34X2G41wvZaF5H0V7C.jpg"
            ),

            DataEntity(
                899082,
                "Harry Potter 20th Anniversary: Return to Hogwarts",
                "2022-01-01",
                listOf("Documentary"),
                103,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                8.5f,
                "/34Xss3gwKdwvtomCDkeC2lW4PVB.jpg"
            ),

            DataEntity(
                826749,
                "Fortress",
                "2021-12-17",
                listOf("Crime, Action, Thriller"),
                100,
                "The story revolves around a top-secret resort for retired U.S. intelligence officers. A group of criminals led by Balzary breach the compound, hellbent on revenge on Robert, forcing the retired officer and his son to save the day.",
                6.3f,
                "/m76LAg0MchIcIW9i4yXsQPGQJJF.jpg"
            ),

            DataEntity(
                818192,
                "Ida Red",
                "2021-11-05",
                listOf("Crime, Thriller, Drama, Action"),
                111,
                "Ida Red may not survive her 20-year prison sentence for armed robbery. She turns to her son, Wyatt, for one last job and a chance to regain her freedom.",
                5.6f,
                "/etMxKseW67499tUJonLNHXTF538.jpg"
            ),

            DataEntity(
                524434,
                "Eternals",
                "2021-11-03",
                listOf("Action, Adventure, Fantasy, Science Fiction"),
                157,
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                7.1f,
                "/6AdXwFTRTAzggD2QUTt5B7JFGKL.jpg"
            ),

            DataEntity(
                585245,
                "Clifford the Big Red Dog",
                "2021-11-10",
                listOf("Animation, Comedy, Family"),
                97,
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                7.4f,
                "/oifhfVhUcuDjE61V5bS5dfShQrm.jpg"
            )
        )
    }

    fun getTvShow(): ArrayList<DataEntity> {
        return arrayListOf(
            DataEntity(
                77169,
                "Cobra Kai",
                "2018-05-02",
                listOf("Action & Adventure, Drama"),
                30,
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                8.1f,
                "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg"
            ),

            DataEntity(
                115036,
                "The Book of Boba Fett",
                "2021-12-29",
                listOf("Sci-Fi & Fantasy, Action & Adventure"),
                39,
                "Legendary bounty hunter Boba Fett and mercenary Fennec Shand must navigate the galaxy’s underworld when they return to the sands of Tatooine to stake their claim on the territory once ruled by Jabba the Hutt and his crime syndicate.",
                8.4f,
                "/gNbdjDi1HamTCrfvM9JeA94bNi2.jpg"
            ),

            DataEntity(
                71914,
                "The Wheel of Time",
                "2021-11-18",
                listOf("Sci-Fi & Fantasy, Drama"),
                56,
                "Follow Moiraine, a member of the shadowy and influential all-female organization called the “Aes Sedai” as she embarks on a dangerous, world-spanning journey with five young men and women. Moiraine believes one of them might be the reincarnation of an incredibly powerful individual, whom prophecies say will either save humanity or destroy it.",
                8f,
                "/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg"
            ),

            DataEntity(
                88329,
                "Hawkeye",
                "2021-11-24",
                listOf("Action & Adventure, Drama"),
                50,
                "Former Avenger Clint Barton has a seemingly simple mission: get back to his family for Christmas. Possible? Maybe with the help of Kate Bishop, a 22-year-old archer with dreams of becoming a superhero. The two are forced to work together when a presence from Barton’s past threatens to derail far more than the festive spirit.",
                8.4f,
                "/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg"
            ),

            DataEntity(
                89614,
                "Sword Snow Stride",
                "2021-12-15",
                listOf("Drama"),
                40,
                "Xu Xiao has risen to become King of Northern Liang at a time of great upheaval in China. Steppe kingdoms have risen with deadly intent, and rebellious uprisings threaten to destabilise the realm in the south. Xu Xiao has managed to defeat them all. His unconventional, free-spirited son and heir Xu Feng Nian has spent years on the road, honing his horse skills and fighting prowess. Along the way, he meets the double sword-wielding martial arts expert Nan Gong Pu She, who becomes his confidante. Also joining the royal household is a woman named Jiang Ni. At age 12, she joined the court of the Northern Liang. She is the princess of a rival kingdom, and could be harbouring deep sentiments of revenge. When Xu Feng Nian has to take to the throne, some at court worry he will not be able to follow in the footsteps of his father. But things come to a head when the party has to travel to another province to fight a decisive campaign, the result of which could determine the future of the realm.",
                5.9f,
                "/avUmZDbbCcvnIFw0yrTM3A4CLlW.jpg"
            ),

            DataEntity(
                90462,
                "Chucky",
                "2021-10-12",
                listOf("Crime"),
                46,
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                7.9f,
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg"
            ),

            DataEntity(
                1416,
                "Grey's Anatomy",
                "2005-03-27",
                listOf("Drama"),
                43,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                8.2f,
                "/zPIug5giU8oug6Xes5K1sTfQJxY.jpg",
            ),

            DataEntity(
                84553,
                "Blade Runner: Black Lotus",
                "2021-11-14",
                listOf("Animation, Sci-Fi & Fantasy, Action & Adventure"),
                22,
                "Los Angeles 2032. A young woman wakes up with no memories, and possessing deadly skills. The only clues to her mystery are a locked data device and a tattoo of a black lotus. Putting together the pieces, she must hunt down the people responsible for her brutal and bloody past to find the truth of her lost identity.",
                7.5f,
                "/zHQJkDZ4OjqJnp4vtphxOQ7GIh6.jpg"
            ),

            DataEntity(
                60735,
                "The Flash",
                "2014-10-07",
                listOf("Drama, Sci-Fi & Fantasy"),
                44,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                7.8f,
                "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            ),

            DataEntity(
                63174,
                "Lucifer",
                "2016-01-25",
                listOf("Crime, Sci-Fi & Fantasy"),
                62,
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                8.5f,
                "/ekZobS8isE6mA53RAiGDG93hBxL.jpg"
            ),

            DataEntity(
                93405,
                "Squid Game",
                "2021-09-17",
                listOf("Action & Adventure, Mystery, Drama"),
                54,
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                7.8f,
                "/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg"
            ),

            DataEntity(
                71912,
                "The Witcher",
                "2019-12-20",
                listOf("Sci-Fi & Fantasy, Drama, Action & Adventure"),
                60,
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                8.2f,
                "/7vjaCdMw15FEbXyLQTVa04URsPm.jpg"
            ),

            DataEntity(
                73586,
                "Yellowstone",
                "2018-06-20",
                listOf("Western, Drama"),
                92,
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                8f,
                "/iqWCUwLcjkVgtpsDLs8xx8kscg6.jpg"
            ),

            DataEntity(
                85552,
                "Euphoria",
                "2019-06-16",
                listOf("Drama"),
                60,
                "A group of high school students navigate love and friendships in a world of drugs, sex, trauma, and social media.",
                8.4f,
                "/jtnfNzqZwN4E32FGGxx1YZaBWWf.jpg"
            ),

            DataEntity(
                60574,
                "Peaky Blinders",
                "2013-09-12",
                listOf("Crime, Drama"),
                60,
                "A gangster family epic set in 1919 Birmingham, England and centered on a gang who sew razor blades in the peaks of their caps, and their fierce boss Tommy Shelby, who means to move up in the world.",
                8.6f,
                "/bGZn5RVzMMXju4ev7xbl1aLdXqq.jpg"
            )
        )
    }

    fun getRemoteMovies(): List<MovieResponse> {
        return listOf(
            MovieResponse(
                634649,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "2021-12-15",
                8.4f,
                "Spider-Man: No Way Home",
                genres = listOf("28, 12, 878"),
                genresDetail = listOf(
                    GenreResponse(
                        28,
                        "Action"
                    ),
                    GenreResponse(
                        12,
                        "Adventure"
                    ),
                    GenreResponse(
                        878,
                        "Science Fiction"
                    )
                ),
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                148
            ),

            MovieResponse(
                568124,
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "2021-11-24",
                7.8f,
                "Encanto",
                 genres =  listOf("Animation, Comedy, Family, Fantasy"),
                 genresDetail = listOf(),
                "/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                102
            ),

            MovieResponse(
                460458,
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                "2021-11-24",
                6f,
                "Resident Evil: Welcome to Raccoon City",
                genres = listOf("Horror, Action, Science Fiction"),
                genresDetail = listOf(),
                "/6WR7wLCX0PGLhj51qyvK8MIxtT5.jpg",
                107
            ),

            MovieResponse(
                624860,
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                "2021-12-16",
                7f,
                "The Matrix Resurrections",
                genres = listOf("Adventure, Action, Science Fiction"),
                genresDetail = listOf(),
                "/gZlZLxJMfnSeS60abFZMh1IvODQ.jpg",
                148
            ),

            MovieResponse(
                580489,
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "2021-09-30",
                7.2f,
                "Venom: Let There Be Carnage",
                genres =  listOf("Science Fiction, Action, Adventure"),
                genresDetail = listOf(),
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                97,
            ),

            MovieResponse(
                512195,
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "2021-11-04",
                6.8f,
                "Red Notice",
                genres = listOf("Action, Comedy, Crime, Thriller"),
                genresDetail = listOf(),
                "/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
                117,
            ),

            MovieResponse(
                438695,
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "2021-12-01",
                7.5f,
                "Sing 2",
                genres = listOf("Animation, Comedy, Family, Music"),
                genresDetail = listOf(),
                "/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                110,
            ),

            MovieResponse(
                425909,
                "When a single mom and her two kids arrive in a small town, they begin to discover their connection to the original Ghostbusters and the secret legacy their grandfather left behind.",
                "2021-11-11",
                7.2f,
                "Ghostbusters: Afterlife",
                genres = listOf("Comedy, Fantasy, Adventure"),
                genresDetail = listOf(),
                "/sg4xJaufDiQl7caFEskBtQXfD4x.jpg",
                124,
            ),

            MovieResponse(
                566525,
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "2021-09-01",
                7.8f,
                "Shang-Chi and the Legend of the Ten Rings",
                genres = listOf("Action, Adventure, Fantasy"),
                genresDetail = listOf(),
                "/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg",
                132
            ),

            MovieResponse(
                787310,
                "An enchanting making-of story told through all-new in-depth interviews and cast conversations, inviting fans on a magical first-person journey through one of the most beloved film franchises of all time.",
                "2021-10-08",
                5.9f,
                "Survive the Game",
                genres = listOf("Action, Thriller, Crime"),
                genresDetail = listOf(),
                "/xF1uc2pEf34X2G41wvZaF5H0V7C.jpg",
                97
            ),

            MovieResponse(
                899082,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "2022-01-01",
                8.5f,
                "Harry Potter 20th Anniversary: Return to Hogwarts",
                genres = listOf("Documentary"),
                genresDetail = listOf(),
                "/34Xss3gwKdwvtomCDkeC2lW4PVB.jpg",
                103
            ),

            MovieResponse(
                826749,
                "The story revolves around a top-secret resort for retired U.S. intelligence officers. A group of criminals led by Balzary breach the compound, hellbent on revenge on Robert, forcing the retired officer and his son to save the day.",
                "2021-12-17",
                6.3f,
                "Fortress",
                genres = listOf("Crime, Action, Thriller"),
                genresDetail = listOf(),
                "/m76LAg0MchIcIW9i4yXsQPGQJJF.jpg",
                100
            ),

            MovieResponse(
                818192,
                "Ida Red may not survive her 20-year prison sentence for armed robbery. She turns to her son, Wyatt, for one last job and a chance to regain her freedom.",
                "2021-11-05",
                5.6f,
                "Ida Red",
                genres = listOf("Crime, Thriller, Drama, Action"),
                genresDetail = listOf(),
                "/etMxKseW67499tUJonLNHXTF538.jpg",
                111
            ),

            MovieResponse(
                524434,
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "2021-11-03",
                7.1f,
                "Eternals",
                genres = listOf("Action, Adventure, Fantasy, Science Fiction"),
                genresDetail = listOf(),
                "/6AdXwFTRTAzggD2QUTt5B7JFGKL.jpg",
                157
            ),

            MovieResponse(
                585245,
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                "2021-11-10",
                7.4f,
                "Clifford the Big Red Dog",
                genres = listOf("Animation, Comedy, Family"),
                genresDetail = listOf(),
                "/oifhfVhUcuDjE61V5bS5dfShQrm.jpg",
                97
            ),
        )
    }

    fun getRemoteTvShow(): List<TvShowResponse> {
        return listOf(
            TvShowResponse(
                77169,
                "2018-05-02",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                genres = listOf("10759, 18"),
                genresDetail = listOf(
                    GenreResponse(
                        10759,
                        "Action & Adventure"
                    ),
                    GenreResponse(
                        18,
                        "Drama"
                    )
                ),
                8.1f,
                "Cobra Kai",
                duration = listOf(30),
                "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg"
            ),

            TvShowResponse(
                115036,
                "2021-12-29",
                "Legendary bounty hunter Boba Fett and mercenary Fennec Shand must navigate the galaxy’s underworld when they return to the sands of Tatooine to stake their claim on the territory once ruled by Jabba the Hutt and his crime syndicate.",
                genres = listOf("Sci-Fi & Fantasy, Action & Adventure"),
                genresDetail = listOf(),
                8.4f,
                "The Book of Boba Fett",
                duration = listOf(39),
                "/gNbdjDi1HamTCrfvM9JeA94bNi2.jpg"
            ),

            TvShowResponse(
                71914,
                "2021-11-18",
                "Follow Moiraine, a member of the shadowy and influential all-female organization called the “Aes Sedai” as she embarks on a dangerous, world-spanning journey with five young men and women. Moiraine believes one of them might be the reincarnation of an incredibly powerful individual, whom prophecies say will either save humanity or destroy it.",
                genres = listOf("Sci-Fi & Fantasy, Drama"),
                genresDetail = listOf(),
                8f,
                "The Wheel of Time",
                duration = listOf(56),
                "/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg"
            ),

            TvShowResponse(
                88329,
                "2021-11-24",
                "Former Avenger Clint Barton has a seemingly simple mission: get back to his family for Christmas. Possible? Maybe with the help of Kate Bishop, a 22-year-old archer with dreams of becoming a superhero. The two are forced to work together when a presence from Barton’s past threatens to derail far more than the festive spirit.",
                genres = listOf("Action & Adventure, Drama"),
                genresDetail = listOf(),
                8.4f,
                "Hawkeye",
                duration = listOf(50),
                "/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg"
            ),

            TvShowResponse(
                89614,
                "2021-12-15",
                "Xu Xiao has risen to become King of Northern Liang at a time of great upheaval in China. Steppe kingdoms have risen with deadly intent, and rebellious uprisings threaten to destabilise the realm in the south. Xu Xiao has managed to defeat them all. His unconventional, free-spirited son and heir Xu Feng Nian has spent years on the road, honing his horse skills and fighting prowess. Along the way, he meets the double sword-wielding martial arts expert Nan Gong Pu She, who becomes his confidante. Also joining the royal household is a woman named Jiang Ni. At age 12, she joined the court of the Northern Liang. She is the princess of a rival kingdom, and could be harbouring deep sentiments of revenge. When Xu Feng Nian has to take to the throne, some at court worry he will not be able to follow in the footsteps of his father. But things come to a head when the party has to travel to another province to fight a decisive campaign, the result of which could determine the future of the realm.",
                genres = listOf("Drama"),
                genresDetail = listOf(),
                5.9f,
                "Sword Snow Stride",
                duration = listOf(40),
                "/avUmZDbbCcvnIFw0yrTM3A4CLlW.jpg"
            ),

            TvShowResponse(
                90462,
                "2021-10-12",
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                genres = listOf("Crime"),
                genresDetail = listOf(),
                7.9f,
                "Chucky",
                duration = listOf(46),
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg"
            ),

            TvShowResponse(
                1416,
                "2005-03-27",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                genres = listOf("Drama"),
                genresDetail = listOf(),
                8.2f,
                "Grey's Anatomy",
                duration = listOf(43),
                "/zPIug5giU8oug6Xes5K1sTfQJxY.jpg",
            ),

            TvShowResponse(
                84553,
                "2021-11-14",
                "Los Angeles 2032. A young woman wakes up with no memories, and possessing deadly skills. The only clues to her mystery are a locked data device and a tattoo of a black lotus. Putting together the pieces, she must hunt down the people responsible for her brutal and bloody past to find the truth of her lost identity.",
                genres = listOf("Animation, Sci-Fi & Fantasy, Action & Adventure"),
                genresDetail = listOf(),
                7.5f,
                "Blade Runner: Black Lotus",
                duration = listOf(22),
                "/zHQJkDZ4OjqJnp4vtphxOQ7GIh6.jpg"
            ),

            TvShowResponse(
                60735,
                "2014-10-07",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                genres = listOf("Drama, Sci-Fi & Fantasy"),
                genresDetail = listOf(),
                7.8f,
                "The Flash",
                duration = listOf(44),
                "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            ),

            TvShowResponse(
                63174,
                "2016-01-25",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                genres = listOf("Crime, Sci-Fi & Fantasy"),
                genresDetail = listOf(),
                8.5f,
                "Lucifer",
                duration = listOf(62),
                "/ekZobS8isE6mA53RAiGDG93hBxL.jpg"
            ),

            TvShowResponse(
                93405,
                "2021-09-17",
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                genres = listOf("Action & Adventure, Mystery, Drama"),
                genresDetail = listOf(),
                7.8f,
                "Squid Game",
                duration = listOf(54),
                "/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg"
            ),

            TvShowResponse(
                71912,
                "2019-12-20",
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                genres = listOf("Sci-Fi & Fantasy, Drama, Action & Adventure"),
                genresDetail = listOf(),
                8.2f,
                "The Witcher",
                duration = listOf(60),
                "/7vjaCdMw15FEbXyLQTVa04URsPm.jpg"
            ),

            TvShowResponse(
                73586,
                "2018-06-20",
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                genres = listOf("Western, Drama"),
                genresDetail = listOf(),
                8f,
                "Yellowstone",
                duration = listOf(92),
                "/iqWCUwLcjkVgtpsDLs8xx8kscg6.jpg"
            ),

            TvShowResponse(
                85552,
                "2019-06-16",
                "A group of high school students navigate love and friendships in a world of drugs, sex, trauma, and social media.",
                genres = listOf("Drama"),
                genresDetail = listOf(),
                8.4f,
                "Euphoria",
                duration = listOf(60),
                "/jtnfNzqZwN4E32FGGxx1YZaBWWf.jpg"
            ),

            TvShowResponse(
                60574,
                "2013-09-12",
                "A gangster family epic set in 1919 Birmingham, England and centered on a gang who sew razor blades in the peaks of their caps, and their fierce boss Tommy Shelby, who means to move up in the world.",
                genres = listOf("Crime, Drama"),
                genresDetail = listOf(),
                8.6f,
                "Peaky Blinders",
                duration = listOf(60),
                "/bGZn5RVzMMXju4ev7xbl1aLdXqq.jpg"
            )
        )
    }
}