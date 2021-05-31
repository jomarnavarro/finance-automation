#!/usr/bin/env bash

echo "checking for hub ready."

while [[ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != true ]]; do
  sleep 1
done

echo "hub is ready."

java -cp finance-automation.jar:finance-automation-tests.jar:libs/* \
-DBROWSER=$BROWSER \
-DHUB_HOST=$HUB_HOST \
-DAPP_URL=$APP_URL \
org.testng.TestNG $SUITE_FILE
