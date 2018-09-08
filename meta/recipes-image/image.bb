DESCRIPTION = "Full baguera-ng image"
DEPENDS = "cadenceur PCIeAccess dltwrapper"
PROVIDES = "image"

PN = "image"

DESCRIPTION = "Full baguera-ng image"
DEPENDS = "cadenceur PCIeAccess dltwrapper"
PROVIDES = "image"

PN = "image"
python do_fetch() {
	bb.plain("image Fetch")
}


do_configure[deptask] = "do_populate_sysroot"

python do_configure () {
	bb.plain("image Configure")
}

python do_clean () {
	bb.plain("image Clean")
}

python do_build () {
	bb.plain("image Build")
}

python do_populate_sysroot() {
	bb.plain("image Populate sysroot")
}


