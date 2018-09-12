DESCRIPTION = "Full baguera-ng image"
DEPENDS = "cadenceur PCIeAccess dltwrapper"
PROVIDES = "image"

PN = "image"

PR = "3"
PV = "14"

python do_fetch() {
	bb.plain("image Fetch")
}



python do_configure () {
	bb.plain("image Configure")
}

python do_clean () {
	bb.plain("image Clean")
}

python do_build () {
	bb.plain("image Build")
}

do_populate_sysroot() {
	mkdir -p ${SYSROOT}/usr/src
	cp ${TOPDIR}/src/* ${SYSROOT}/usr/src/.
}


do_pack () {
	 cd ${SYSROOT}
	 tar -cvf  ${PACKAGEDIR}/${PN}-${PR}.${PV}.tar  . --transform='s/^\./${PN}-${PR}/g'
}

do_rpm (){
	cp ${TOPDIR}/src/image.spec ${RPMBUILD}/SPECS
	cp ${PACKAGEDIR}/${PN}-${PR}.${PV}.tar ${RPMBUILD}/SOURCES

	rpmbuild --define "_topdir ${RPMBUILD}" -bp  ${RPMBUILD}/SPECS/image.spec
# compilation
	rpmbuild --define "_topdir ${RPMBUILD}" -bc --short-circuit ${RPMBUILD}/SPECS/image.spec
# Empaquetage, contrôles des %files
	rpmbuild --define "_topdir ${RPMBUILD}" -bi --short-circuit ${RPMBUILD}/SPECS/image.spec
# construction des fichiers RPM (cette dernière commande va exécuter de nouveau les procédures précédentes)
	rpmbuild --define "_topdir ${RPMBUILD}" -ba ${RPMBUILD}/SPECS/image.spec
}
