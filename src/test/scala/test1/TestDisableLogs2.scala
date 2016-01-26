package test1

import just4fun.utils.logger.Logger._

class TestDisableLogs2 {
	val _dl = disableDebugCode()

	logV("2 DISABLE LOGS: This is visible only if logs enabled   :)")
}
