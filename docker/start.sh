docker pull sadtask/vuejs.spring-boot.mysql:$1
docker container stop sadtask
docker run --detach --rm --name sadtask --env-file ./env.list \
  -e "SPRING_PROFILES_ACTIVE=staging,docker" \
  -p 8080:8080 -p 9000:9000 sadtask/vuejs.spring-boot.mysql:$1
