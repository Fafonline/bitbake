DESCRIPTION = "DLT logger wrapper"
DEPENDS = ""

PN = "dltwrapper"

python do_fetch() {
	bb.plain("dltwrapper Fetch")
}
python do_configure () {
	bb.plain("dltwrapper Configure")
}

python do_clean () {
	bb.plain("dltwrapper Clean")
}

python do_build () {
	bb.plain("dltwrapper Build")
}

python do_print () {
	bb.plain("Print")
}

python do_populate_sysroot() {
	bb.plain("dltwrapper Populate sysroot")
}
