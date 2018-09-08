DESCRIPTION = "Full Baguera-ng  cadenceur"
DEPENDS = "PCIeAccess dltwrapper"

PN = "cadenceur"
python do_fetch() {
	bb.plain("Cadenceur Fetch")
}


do_configure[deptask] = "do_populate_sysroot"

python do_configure () {
	bb.plain("Cadenceur Configure")
}

python do_clean () {
	bb.plain("Cadenceur Clean")
}

python do_build () {
	bb.plain("Cadenceur Build")
}

python do_populate_sysroot() {
	bb.plain("Cadenceur Populate sysroot")
}

