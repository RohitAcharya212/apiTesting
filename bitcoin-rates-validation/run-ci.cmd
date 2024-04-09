env=ci

echo "Running cucumber tests using $env profile"

mvn clean verify -Dspring.profiles.active="$env" -Dcucumber.filter.tags="@ci"

echo -e "\nTests on $env with tags [$1] completed.\n"
