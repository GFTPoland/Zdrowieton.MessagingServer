#!/bin/bash

if [ -n "$1" ]
then
	cat scripts/deploy.sh | ssh $1 /bin/bash
else
	echo "Missing parameter: host location (e.g. user@host.com)."
fi

