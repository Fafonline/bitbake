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
#cp -R * $RPM_BUILD_ROOT/.

find %buildroot -type f \( -name '*.so' -o -name '*.so.*' \) -exec chmod 755 {} +

%files
/*


%doc


%changelog

