# Copyright (C) 2003  Chris Larson
#
# Permission is hereby granted, free of charge, to any person obtaining a
# copy of this software and associated documentation files (the "Software"),
# to deal in the Software without restriction, including without limitation
# the rights to use, copy, modify, merge, publish, distribute, sublicense,
# and/or sell copies of the Software, and to permit persons to whom the
# Software is furnished to do so, subject to the following conditions:
# 
# The above copyright notice and this permission notice shall be included
# in all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
# THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
# OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
# ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
# OTHER DEALINGS IN THE SOFTWARE.

die() {
	bbfatal "$*"
}

bbnote() {
	echo "NOTE:" "$*"
}

bbwarn() {
	echo "WARNING:" "$*"
}

bbfatal() {
	echo "FATAL:" "$*"
	exit 1
}

addtask showdata
do_showdata[nostamp] = "1"
python do_showdata() {
	import sys
	# emit variables and shell functions
	bb.data.emit_env(sys.__stdout__, d, True)
	# emit the metadata which isnt valid shell
	for e in bb.data.keys(d):
		if d.getVarFlag(e, 'python', False):
			bb.plain("\npython %s () {\n%s}" % (e, d.getVar(e, True)))
}

addtask listtasks
do_listtasks[nostamp] = "1"
python do_listtasks() {
	import sys
	for e in bb.data.keys(d):
		if d.getVarFlag(e, 'task', False):
			bb.plain("%s" % e)
}



addtask do_fetch
base_do_fetch() {
	:
}

addtask do_configure after do_fetch
do_configure[deptask] = "do_populate_sysroot"
base_do_configure () {
	:
}

addtask do_clean after do_configure
base_do_clean () {
	:
}
addtask do_build after do_clean

do_build[dirs] = "${TOPDIR}"
# do_build[nostamp] = "1"
python base_do_build () {
	bb.note("The included, default BB base.bbclass does not define a useful default task.")
	bb.note("Try running the 'listtasks' task against a .bb to see what tasks are defined.")
}
addtask do_populate_sysroot after do_build
do_populate_sysroot[dirs]  = "${SYSROOT}"
do_populate_sysroot[deptask] = "do_populate_sysroot"
python base_do_populate_sysroot() {
	bb.plain("Base Populate sysroot")
}

addtask do_pack after do_populate_sysroot
python base_do_populate_sysroot() {
	bb.plain("Base Populate sysroot")
}


EXPORT_FUNCTIONS do_clean do_mrproper do_build do_populate_sysroot do_pack
