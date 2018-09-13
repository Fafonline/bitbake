DESCRIPTION = "DLT logger wrapper"
DEPENDS = "dlt-daemon"

PN = "dltwrapper"

#SRCREV="824084a85137f71baa4cb160e97212a6ecdc4df9"
SRCREV= "--track origin/FAL_DEV-bitbake"
SRC_URI="http://tfs2017:8080/tfs/DefaultCollection/_git/BAGUERA"

S = "${WORKDIR}/${PN}-${PV}-${PR}/CPU/src/dltwrapper"

do_fetch () {
	git clone ${SRC_URI} ${WORKDIR}/${PN}-${PV}-${PR}
	cd ${WORKDIR}/${PN}-${PV}-${PR}
	git checkout ${SRCREV} 
}

inherit cmake

do_populate_sysroot() {
	cd ${S}
	make install DESTDIR=${DESTDIR}
}