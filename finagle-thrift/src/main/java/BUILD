java_library(
  sources=rglobs('*.java'),
  dependencies=[
    '3rdparty/jvm/org/apache/thrift:libthrift-0.5.0',
  ],
  provides=artifact(org='com.twitter',
                    name='finagle-thrift-java',
                    repo = artifactory,),
)

# For usecases (like scrooge codegen) where this dependency is used, but not detected as
# used by zinc.
target(
  name='forced',
  scope='forced',
  dependencies=[':java'],
)
