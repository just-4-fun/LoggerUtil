package com.blabla.myapp

import just4fun.utils.logger.Logger._

class MyApp {
	val _dl = disableDebugCode()

	logE("WTF   ?")
	logV("just logV")
	def test(): Unit = {
		val e = new Exception("OOPS...")
		e.initCause(new Exception("BECAUSE..."))
		logE(e, "Don't worry :)")
	}
	def test2(): Unit = {
		throw new Exception("BOOM!!")
	}
}
