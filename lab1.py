enc_msg = [
    "fqjcb rwjwj vnjax bnkhj whxcq nawjv nfxdu mbvnu ujbbf nnc",
    "oczmz vmzor jocdi bnojv dhvod igdaz admno ojbzo rcvot jprvi "
    "oviyv aozmo cvooj ziejt dojig toczr dnzno jahvi fdiyv xcdzq zoczn zxjiy",
    "ejitp spawa qleji taiul rtwll rflrl laoat wsqqj atgac kthls "
    "iraoa twlpl qjatw jufrh lhuts qataq itats aittk stqfj cae",
    "iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn "
    "jbeuq iihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque "
    "aqaqm oejjs hqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj "
    "jejjz nshna hnmyt isnae sqfun dqzew qiead zevqi zhnjq shqze "
    "udqai jrmtq uishq ifnun siiqa suoij qqfni syyle iszhn bhmei squih "
    "nimnx hsead shqmr udquq uaqeu iisqe jshnj oihyy snaxs hqihe lsilu ymhni tyz"
    ]


dec_msg = ""

#print(enc_msg[0], "\n")
#print(enc_msg[1], "\n")
#print(enc_msg[2], "\n")
#print(enc_msg[3], "\n")

#letter frequency
lf = {}

for keys in enc_msg[1]:
    if keys != ' ':
        lf[keys] = lf.get(keys, 0) + 1

print(lf)

max_letter = max(lf, key=lambda key: lf[key])

#most used english letters
muel = ['e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', ]
for i in muel:
    dec_msg = ''
    #offset = (ord(max_letter) + 26 - ord(muel[8]))%26
    offset = (ord(max_letter) + 26 - ord(i))%26
    #print(offset)

    for letter in enc_msg[1]:
        if letter != ' ':
            dec = ((ord(letter) - ord('a') + 26 - offset)% 26) + ord('a')
            #print(dec, chr(dec)
        else:
            dec = ord(' ')
        dec_msg += chr(dec)

    print(i, dec_msg, "\n")
