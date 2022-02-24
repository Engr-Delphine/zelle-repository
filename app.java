IQ: Write a script to create users in a Linux Redhat Server
#!/bin/bash
# This script will create users in Redhat Servers
# Please, only run this script if you are the root user.
echo "Please enter the new user name you want to create"
read name
adduser $name
echo "$name user created successfully"
