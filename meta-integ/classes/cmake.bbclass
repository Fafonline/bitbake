EXTRA_CMAKE = "-DCMAKE_INSTALL_LIBDIR=${libdir}"
EXTRA_CMAKE += "-DCMAKE_INSTALL_PREFIX=${ROOT_INSTALL_DIR}"

cmake_do_configure () {
	cd ${S}
	export PKG_CONFIG_PATH="${SYSROOT}/${packagedir}"
	export PKG_CONFIG_SYSROOT_DIR="${SYSROOT}"
    echo `pkg-config automotive-dlt --cflags` > /tmp/bitbake.log
	cmake ${EXTRA_CMAKE} .
}

cmake_do_clean () {
	cd ${S}
	make clean
}

cmake_do_build () {
	cd ${S}
	make
}
# cmake_do_populate_sysroot () {
# 	cd ${S}
# 	make install
# # }
# python cmake_do_configure () {
# 	bb.plain("cmake configure")
# }

# python cmake_do_clean () {
# 	bb.plain("cmake clean")
# }

# python cmake_do_build () {
# 	bb.plain("cmake build")
# }

# pythoncmake_do_populate_sysroot () {
# 	bb.plain("cmake populate sysroot")
# }
EXPORT_FUNCTIONS do_configure do_clean do_build do_populate_sysroot