addtask build


do_fetch[stamp-extra-info] = "${PN}"
do_configure[stamp-extra-info] = "${PN}"
do_clean[stamp-extra-info] = "${PN}"
do_build[stamp-extra-info] = "${PN}"
do_populate_sysroot[stamp-extra-info] = "${PN}"
do_configure[deptask] = "do_populate_sysroot"

addtask do_fetch
base_do_fetch() {
	:
}
addtask do_configure after do_fetch

base_do_configure () {
	:
}

addtask do_clean after do_configure
base_do_clean () {
	:
}
addtask do_build after do_clean
base_do_build () {
	:
}

addtask do_populate_sysroot after do_build
do_populate_sysroot[dirs]  = "${SYSROOT}"
do_populate_sysroot() {
	:
}
