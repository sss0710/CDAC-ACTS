#!/bin/bash
read -p "enter the username for the user :" usr

useradd -m -p "$usr" "$usr"

echo "User $usr added"

usermod -s /bin/nologin/ $usr

echo "Nologin Shell assigned to User $usr"
