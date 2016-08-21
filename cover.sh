exts=(java )
for ext in ${exts[*]}
do
    for i in `find . -name *.$ext`
    do
        echo -e "$i" 
        echo iconv -c -f gbk -t utf-8 $i > ./iconv.tmp
        iconv -c -f gbk -t utf-8 $i > ./iconv.tmp
        echo mv ./iconv.tmp $i
        mv ./iconv.tmp $i
    done
done