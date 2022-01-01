#!/bin/bash
# @echo on
# -e causes the shell to exit if any subcommand or pipeline returns a non-zero status
# -v causes the shell to view each command
# set -e -v


# sed flag -i for in-place editing, substitute line 6 - NOTE: using ' for literal and " for variable
cat pom.xml  | grep -a -m 1 "<version>" | sed 's/.*<version>//p' | head -1 | sed 's/<\/version>//p' | head -1 
# https://stackoverflow.com/questions/14093452/grep-only-the-first-match-and-stop
# https://www.gnu.org/software/sed/manual/sed.html#Overview
# https://unix.stackexchange.com/questions/84922/extract-a-part-of-one-line-from-a-file-with-sed