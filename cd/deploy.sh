#!/usr/bin/env bash
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    ./gradlew publish -Psigning.gnupg.keyName=$SIGNING_KEY_NAME -Psigning.gnupg.passphrase=$SIGNING_KEY_PASS -PsonatypeUsername=$SONATYPE_USERNAME -PsonatypePassword=$SONATYPE_PASSWORD
fi