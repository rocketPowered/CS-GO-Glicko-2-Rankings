# CS-GO-Glicko-2-Rankings
Using the Glicko-2 ranking system to rank the top professional teams of CS:GO for 2018

This is a project that ranks the top CS:GO teams by using the Glicko-2 algorithm, designed by Mark Glickman.
This project follows the steps laid out in this paper: http://www.glicko.net/glicko/glicko2.pdf

# Some F.A.Q and other points:
### Q: What period is this ranking system for? Are there any problems with that?

A: I tried to run calculations for all of 2018, from january 1st up to this point (July 31st). I also only ran calculations on large tournaments. This could cause problems with players or teams who play lower tier matches and then move to a bigger stage. For example, if a big team picks up a player from a lower tier team, assuming that player wasn't in any big tournaments to that point their elo will be set to the default elo (1500), even if they deserve a higher elo due to placings and performance in other tournaments. This issue could be resolved either by adding more matches (something I cover in the question below), or it will be resolved over time as more matches are played and added to this.


### Q: Do you use online or lan results or both?

A: I don't know how to write a bot to scrape data for me, so I had to type everything manually. To make this easier, I'm onl using matches from large lan events, online matches are ignored.


### Q: How does this work for teams? Isn't Glicko-2 designed for single sports like chess?

A: Yes, but I'm using some changes based on Rob Kohr's work at https://github.com/robkohr/glicko
This means that each player gets an individual ranking, and when two teams play I will simulate each player playing against each player on the other team, before scaling any elo changes to account for the fact that each player is on a team of 5. This also helps if teams make roster changes, by calculating their new elo based on their players instead of old lineups.


### Q: What do you mean scale elo changes?

A: I mean that if team A beats team B, I will simulate each player on team A beating every player on team B, and then take the change in elo and scale it by a factor (in this case 0.2) to account for the fact that team A has 5 players. This means a team the correct amount of elo, instead of (roughly) 5x what they should be.


### Q: Does individual performance matter?

A: No, this rating system does not take in to account personal performance, only wins and losses against other teams. For example, s1mple and zeus would have the same personal rating having played together for all of 2018, even though s1mple often has a much better personal performance.


### Q: Does the final score (rounds) matter?

A: No, it doesn't matter if a team wins 16-0, 16-14, or 22-20. A win is just counted as a win. I could maybe eventually adjust things so score increates or decreases elo gain, but that would be a different system and could give very different results.


### Q: How do you deal with bo1/bo3/bo5

A: If a team wins a bo3 2-0, I simulate that as the winning team winning 2 matches over the losing team. If a team won a bo3 2-1, I would simulate that as the winning team playing 3 matches, winning two and losing one. I have no clue if this is the best way to do things, but it's what I did. If you have an improvements let me know. I just did this because winning a bo3 or bo5 should be more impactful than winning a bo1.


### Q: What about rating decay?

A: I couldn't really figure out how rating decay factors in to the glicko-2 system. I assume that every rating period (maybe a week/month) you would scale down elo but the paper has no specifics on how this is done. I have to assume its either done implicitly in the algorithm (in which case I'm definitely decaying ratings way too often, as I update rating every match not every week), or not done at all in this system (in which case I don't have rating decay).

### Q: What implicit assumptions do you make?

A: I don't really deal with standins too well, or player breaks. For standins to work, I have to add that player to the team, and remove them when they are done. If they are taking the spot of another player for a tournament, that player will be removed from the team temporarily. Because of how I scale rating changes, a team must have 5 players to play a match. Also because I don't think I have rating decay, a player who goes on a break (i.e olof), will not decay rating while they are on break, even if they in theory should.

### Q: What language did you use?

A: This was written in Java, the only language I really know what I'm doing in


### Q: What else needs to be improved?

A: Ideally I would like to incorperate this into a rankings website. I think this would mean storing data on players/teams using SQL and using something (python, php, idk) to calculate rankings every week. This would also probably require scraping data on matches for the week, and doing this automatically. This would require a lot of rewrites of my code and I wouldn't be able to use java anymore. I have no idea how to do any of that, so if you do let me know.

On another note, there are two values in this system that are set based on your applicaiton. These values are Tau, and Volatility. These two values are set in this case to Tau = 0.5 and Volatility = 0.06. These values could be tweaked to be optimal for CS:GO, but I am not going to bother with that right now. If you want to do that or have any input on optimal values, let me know


### Q: I want to help/fix a bug/improve your code

A: All of the source code I wrote is listed here, if you want to copy it and do your own thing feel free (see below). If you would like to help this project, and help keep it optimized and working, send me a message on GitHub and we can figure out how to give you edit permissions or make any changes you feel would be beneficial

### Q: This code is bad/inneficient/what were you doing?

A: I tried to comment anything that I felt wasn't clear. If you're confused by anything, I suggest you read the glicko-2 paper first and see if that helps at all. If you've done that and what I wrote still makes no sense, I'm sorry. I'm a math major, not a CS major so I have little experience actually writing optimized and efficient/smart code. Feel free to let me know of any improvements I can make

### Q: Can I use this code for my own purposes?

A: I mean all of the code is listed here, so you could really do whatever you want. However, please do not use this code anywhere without listing me and giving me credit. Also, nobody should use this for their own monetary gain. Don't make money off of anything I wrote here please.
