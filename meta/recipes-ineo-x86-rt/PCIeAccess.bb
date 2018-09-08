DESCRIPTION = "PCIeAccess driver library" 
DEPENDS = ""
PN = "PCIeAccess"

python do_fetch() {
	bb.plain("PCIeAccess Fetch")
}
python do_configure () {
	bb.plain("PCIeAccess Configure")
}

python do_clean () {
	bb.plain("PCIeAccess Clean")
}

python do_build () {
	bb.plain("PCIeAccess Build")
}

python do_print () {
	bb.plain("Print")
}

python do_populate_sysroot() {
	bb.plain("PCIeAccess Populate sysroot")
}
