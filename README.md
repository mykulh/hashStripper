# hashStripper

A simple program to run over large wordlists / dictionaries to try and clean out any hashes in the wordlist by mistake.
Download the project or just the export/hashStipper.jar

Usage:
java -jar hashStripper.jar <dictionary to strip> 

Two files are created
<dictionary to strip>.hashes.csv
<dictionary to strip>.hashes_removed.dic

The original wordlist/dictionary should be left alone, just in case something goes wrong.

Any feedback or suggestion would be cool.
