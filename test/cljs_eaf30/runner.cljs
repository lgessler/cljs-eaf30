(ns cljs-eaf30.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [cljs-eaf30.core-test]))

(doo-tests 'cljs-eaf30.core-test)
