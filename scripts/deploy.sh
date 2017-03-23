#!/bin/bash
imageName=gftpoland/zdrowieton-backend
containerID=$(docker ps --format {{.ID}} -f ancestor=${imageName})

docker pull $imageName
if [ -n $containerId ]
then
	echo "Stopping and removing Docker container: ${containerID}"
	docker stop ${containerID}
	docker rm ${containerID}
fi
docker run -d -p 8080:8080 $imageName

