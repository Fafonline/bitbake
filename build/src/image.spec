Name:image		
Version:3	
Release:14
Summary: Baguera Package

License: Ineo	
URL:http://tfs2017:8080/tfs/DefaultCollection/_git/BAGUERA		
Source0:image-3.14.tar


%description
Full Baguera-ng package


%prep
%setup -q
%build
%install

install -m 777 -d $RPM_BUILD_ROOT/tmp
install -m 777 -d $RPM_BUILD_ROOT/tmp/usr
install -m 777 -d $RPM_BUILD_ROOT/tmp/usr/src
install -m 777  usr/src/main.c $RPM_BUILD_ROOT/tmp/usr/src/main.c
install -m 777  usr/src/main.h $RPM_BUILD_ROOT/tmp/usr/src/main.h



%files
/tmp/usr/src/main.c
/tmp/usr/src/main.h
%doc


%changelog

