import org.apache.directory.groovyldap.*

ldap = LDAP.newInstance('ldap://localhost:10389/')

results = ldap.search('(objectClass=*)', 'dc=example,dc=com', SearchScope.ONE)
println " ${results.size} entries found ".center(40,'-')
for (entry in results) {
  println entry.dn
}
