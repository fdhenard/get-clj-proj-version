# get-proj-version

A command line utility to retrieve the version number of a Clojure project.  The original use for it was to check version numbers to determine if a new jar should be built for deployment of a Clojure application.

## Usage

### build

`lein uberjar`

### run

    $ java -jar get-clj-proj-version-1.0.0-standalone.jar /path/to/clojure/project
    1.0.0

## License

Copyright © 2016 Frank Henard

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
